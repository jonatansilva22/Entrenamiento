package POO;

public class Coche {
    String color, marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.println("El color del coche1 es:" +coche1.color);
    }
}
