package negocio;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private Domicilio Domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, negocio.Domicilio domicilio, String rfc, String telefono, ArrayList<Cliente> clientes) {
        this.setNombre(nombre);
        setDomicilio(domicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setClientes(clientes);
    }

    public Banco(String nombre, String calle, int numero, String colonia, String estado,
                 int codigoPostal, String rfc, String telefono, ArrayList<Cliente> clientes) {
        this.setNombre(nombre);
        Domicilio elDomicilio =new Domicilio(calle, numero,colonia, estado,codigoPostal);
        this.setDomicilio(elDomicilio);
        this.setRfc(rfc);
        this.setTelefono(telefono);
        this.setClientes(clientes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public negocio.Domicilio getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(negocio.Domicilio domicilio) {
        Domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", Domicilio=" + Domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
