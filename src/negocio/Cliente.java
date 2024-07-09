package negocio;

import java.util.ArrayList;

public class Cliente extends Persona{
    private int numero;
    private String rfc;
    private ArrayList<Cuenta> cuentas;
    private String telefono;
    private String fechaNacimiento;

    public Cliente(String nombre, String apellido,
                   String calle, int numero, String colonia,  String estado,  int codigoPostal,
                   int edad,     String rfc, String telefono, String fechaNacimiento) {
        super(nombre, apellido, calle, numero, colonia, estado, codigoPostal, edad);
        this.rfc = rfc;
//        this.cuentas = cuentas;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() +  " Cliente{" +
                "numero=" + numero +
                ", rfc='" + rfc + '\'' +
                ", cuentas=" + cuentas +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
