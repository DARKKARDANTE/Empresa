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
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Calcular salario de un empleado");
            System.out.println("6. Aumentar salario de un empleado");
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

                    empleado ev = new empleado();
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

                    empleado eh = new empleado();
                    lstempleados.add(eh);
                    break;
                case 4:
                    System.out.println("4. Mostrar todos los empleados");

                    if (lstempleados.isEmpty()){
                        System.out.println("No hay empleados");
                    }
                    else{
                        for (empleado e : lstempleados){
                        e.mostrarInformacion();
                        System.out.println("----------------");
                        }
                    }
                case 5:







                    break;






            }
        }while (op !=0);





























    }
}