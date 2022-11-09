public class main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Francho");
        gato1.setColor("negro");
        gato1.setEstado(true);
        System.out.println(gato1.getColor());

        gato1.DisparaGato();
        gato1.DisparaGato();
        gato1.DisparaGato();
    }
}