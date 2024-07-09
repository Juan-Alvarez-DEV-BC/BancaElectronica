import negocio.Cliente;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Cliente cliente = new Cliente("Juan", "Alvarez",
                                      "Av 39 B # 46 -26",55,"centro", "Ant",555555,
                                      20,"5555","4568987","5mayo");

        System.out.println("cliente = " + cliente);
    }
}
