public class empleadoVentas extends empleado{

    double totalVentasMes;
    double porcentajeCocmicion;

    public empleadoVentas() {
    }

    public empleadoVentas(String id, String nombre, int edad, double salarioBase, double totalVentasMes, double porcentajeCocmicion) {
        super(id, nombre, edad, salarioBase);
        this.totalVentasMes = totalVentasMes;
        this.porcentajeCocmicion = porcentajeCocmicion;



    }

    public double getTotalVentasMes() {
        return totalVentasMes;
    }

    public void setTotalVentasMes(double totalVentasMes) {
        this.totalVentasMes = totalVentasMes;
    }

    public double getPorcentajeCocmicion() {
        return porcentajeCocmicion;
    }

    public void setPorcentajeCocmicion(double porcentajeCocmicion) {
        this.porcentajeCocmicion = porcentajeCocmicion;
    }

    @Override
    public String toString() {
        return  super.toString()+ "empleadoVentas{" +
                "totalVentasMes=" + totalVentasMes +
                ", porcentajeCocmicion=" + porcentajeCocmicion +
                '}';
    }

    public void mostrarInformacion(){
        System.out.println( "id" + id );
        System.out.println("nombre" + nombre);
        System.out.println("edad=" + edad);
        System.out.println( "salarioBase" + salarioBase);
        System.out.println("porcentajeCocmicion" + porcentajeCocmicion);
        System.out.println("totalVentasMes" + totalVentasMes);


    }
}
