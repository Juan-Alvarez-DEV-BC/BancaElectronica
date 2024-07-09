package negocio;

public class Persona extends Object {
    private String nombre;
    private String apellido;
    private Domicilio domicilio;
    private int edad;

    public Persona(String nombre, String apellido, Domicilio domicilio, int edad) {
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
    }

    public Persona(String nombre, String apellido,  String calle, int numero, String colonia, String estado, int codigoPostal, int edad) {
        this.setNombre(nombre);
        Domicilio elDomicilio =new Domicilio(calle, numero,colonia, estado,codigoPostal);
        this.setDomicilio(elDomicilio);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", edad=" + edad +
                '}';
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
