public class empleadoHoras extends empleado {

    int horasTrabajadas;
    double valorHora;

    public empleadoHoras() {
    }

    public empleadoHoras(String id, String nombre, int edad, double salarioBase, int horasTrabajadas, double valorHora) {
        super(id, nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString()+"empleadoHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }

    @Override
    public double calcularSalarioFinal() {

        return horasTrabajadas* valorHora;
    }

    public void mostrarInformacion(){
        System.out.println( "id" + id );
        System.out.println("nombre" + nombre);
        System.out.println("edad=" + edad);
        System.out.println( "salarioBase" + salarioBase);
        System.out.println("horasTrabajadas" + horasTrabajadas);
        System.out.println("valorHora" + valorHora);


    }
}
