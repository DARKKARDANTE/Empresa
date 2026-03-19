import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<empleado> lstempleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.println(lstempleados);
        int op;

        do {

            System.out.println("\n===== MENU EMPLEADOS =====");
            System.out.println("1. Registrar empleado administrativo");
            System.out.println("2. Registrar empleado de ventas");
            System.out.println("3. Registrar empleado por horas");
            System.out.println("4. Mostrar empleados");
            System.out.println("5. Calcular salario de un empleado");
            System.out.println("6. Aumentar salario base de un empleado");
            System.out.println("7. Mostrar empleados mayores de edad");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("1. Registrar empleado administrativo");
                    System.out.println("ID:");
                    String idad = sc.nextLine();

                    System.out.println("Nombre: ");
                    String Nombread = sc.nextLine();

                    System.out.println("Edad:");
                    int edadad = sc.nextInt();

                    System.out.println("Salario base:");
                    double salarioBasead = sc.nextDouble();

                    System.out.println("Bonificacion:");
                    double bonificacion = sc.nextDouble();
                    sc.nextLine();

                    empleadoAdministrativo ea = new empleadoAdministrativo(idad, Nombread, edadad, salarioBasead, bonificacion);
                    lstempleados.add(ea);

                    break;

                case 2:
                    System.out.println("2. Registrar empleado de ventas");

                    System.out.println("ID:");
                    String idve = sc.nextLine();

                    System.out.println("Nombre: ");
                    String Nombreve = sc.nextLine();

                    System.out.println("Edad:");
                    int edadve = sc.nextInt();

                    System.out.println("Salario base:");
                    double salarioBaseve = sc.nextDouble();

                    System.out.println("Total ventas del mes:");
                    double totalVentasMes = sc.nextDouble();

                    System.out.println("%Comision");
                    double comision = sc.nextDouble();

                    empleado ev = new empleadoVentas(idve,Nombreve,edadve,salarioBaseve,totalVentasMes,comision);
                    lstempleados.add(ev);
                    break;

                case 3:
                    System.out.println("3. Registrar empleado por horas");

                    System.out.println("ID:");
                    String idho = sc.nextLine();

                    System.out.println("Nombre: ");
                    String Nombreho = sc.nextLine();

                    System.out.println("Edad:");
                    int edadho = sc.nextInt();

                    System.out.println("Salario base:");
                    double salarioBaseho = sc.nextDouble();

                    System.out.println("Horas trabajadas: ");
                    int horasTrabajadas = sc.nextInt();

                    System.out.println("Valor de la hora");
                    double valorHora = sc.nextDouble();

                    empleado eh = new empleadoHoras(idho, Nombreho, edadho, salarioBaseho, horasTrabajadas, valorHora);
                    lstempleados.add(eh);
                    break;
                case 4:
                    int me;

                    do {
                        System.out.println("4. Mostrar empleados");
                        System.out.println("1. Mostrar todos los empleados ");
                        System.out.println("2. Mostrar todos los empleados administrativos");
                        System.out.println("3. Mostrar todos los empleados deventas");
                        System.out.println("4. Mostrar todos los empleados por horas");
                        System.out.println("0. Salir");
                        System.out.println("Elija una de las opciones 1-4");
                        me = sc.nextInt();
                        switch (me){

                            case 1:
                                System.out.println("1. Mostrar todos los empleados ");
                                System.out.println("=================================");
                                if (lstempleados.isEmpty()){
                                    System.out.println("No hay empleados");
                                }
                                else{

                                    for (empleado e : lstempleados){
                                        if (e instanceof empleado) {
                                            e.mostrarInformacion();
                                            System.out.println("=================================");
                                            break;
                                        }
                                    }

                                }
                                break;
                            case 2:
                                System.out.println("2. Mostrar todos los empleados administrativos");
                                System.out.println("=================================");
                                for (empleado e : lstempleados) {
                                    if (e instanceof empleadoAdministrativo) {
                                        e.mostrarInformacion();
                                        System.out.println("=================================");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("3. Mostrar todos los empleados de ventas");
                                System.out.println("=================================");
                                for (empleado e : lstempleados) {
                                    if (e instanceof empleadoVentas) {
                                        e.mostrarInformacion();
                                        System.out.println("=================================");
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("4. Mostrar todos los empleados por horas");
                                System.out.println("=================================");
                                for (empleado e : lstempleados) {
                                    if (e instanceof empleadoHoras) {
                                        e.mostrarInformacion();
                                        System.out.println("=================================");

                                    }
                                }
                                break;
                        }


                    }while (me !=0);

                case 5:

                    System.out.println("Ingrese el ID del empleado:");
                    String idBuscar = sc.nextLine();

                    boolean encontrado = false;

                    for (empleado e : lstempleados) {

                        if (e.getId().equalsIgnoreCase(idBuscar)) {

                            encontrado = true;

                            if (e instanceof empleadoAdministrativo) {
                                System.out.println(e.calcularSalarioFinal());

                            } else if (e instanceof empleadoVentas) {
                                System.out.println(e.calcularSalarioFinal());


                            } else if (e instanceof empleadoHoras) {
                                System.out.println(e.calcularSalarioFinal());

                            }

                            System.out.println("Salario final de " + e.getNombre() + ": " + e.calcularSalarioFinal());
                            break;
                        }
                    }
                case 6:
                    System.out.println("Ingrese el ID del empleado:");
                    String idAumentosb = sc.nextLine();

                    boolean encontrado2 = false;

                    for (empleado e : lstempleados) {

                        if (e.getId().equalsIgnoreCase(idAumentosb)) {

                            encontrado2 = true;

                            System.out.println("Ingrese porcentaje de aumento:");
                            double aumento = sc.nextDouble();
                            sc.nextLine();

                            double nuevoSalario = e.getSalarioBase() + aumento ;

                            e.setSalarioBase(nuevoSalario);

                            System.out.println("Salario actualizado de " + e.getNombre() + ": " + nuevoSalario);

                            break;
                        }
                    }
                    break;
                case 7:

                    System.out.println("7. Mostrar empleados mayores de edad");
                    boolean Mayores = false;

                    for (empleado e : lstempleados) {

                        if (e.getEdad() >= 18) {

                            e.mostrarInformacion();
                            System.out.println("======================");
                            Mayores = true;

                        }
                    }

                    if (Mayores == false) {
                        System.out.println("no hay empleados mayores de edad");
                    }

                    break;

            }
        }while (op !=0);





























    }
}