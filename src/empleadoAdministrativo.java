public class empleadoAdministrativo extends empleado {

    private double bonificacion;

    public empleadoAdministrativo() {
    }

    public empleadoAdministrativo(String id, String nombre, int edad, double salarioBase, double bonificacion) {
        super(id, nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonificacion=" + bonificacion +
                '}';
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonificacion;
    }



    public void mostrarInformacion(){
        System.out.println( "id" + id );
        System.out.println("nombre" + nombre);
        System.out.println("edad=" + edad);
        System.out.println( "salarioBase" + salarioBase);
        System.out.println("bonificacion" + bonificacion);

    }




}
