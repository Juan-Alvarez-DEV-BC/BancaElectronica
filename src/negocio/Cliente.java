package negocio;

import java.util.ArrayList;

public class Cliente extends Persona{
    private int numero;
    String rfc;
    ArrayList<Cuenta> cuentas;
    String telefono;
    String fechaNacimiento;

    public Cliente(String nombre, String calle, int numero, String colonia, String estado, int codigoPostal, int edad, int numero1, String rfc, ArrayList<Cuenta> cuentas, String telefono, String fechaNacimiento) {
        super(nombre, calle, numero, colonia, estado, codigoPostal, edad);
        this.setNumero(numero1);
        this.rfc = rfc;
        this.cuentas = cuentas;
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
