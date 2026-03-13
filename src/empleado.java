public class empleado {

    protected String id;
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public empleado() {
    }

    public empleado(String id, String nombre, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }


    public void mostrarInformacion(){
        System.out.println( "id: " + id );
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println( "salario Base: " + salarioBase);

    }



















}
