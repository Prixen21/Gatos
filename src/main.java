public class main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Francho");
        gato1.setEstado(true);
        gato1.setColor("negro");
        //
        System.out.println(gato1.getNombre() + " es de color " +  gato1.getColor());
        System.out.println("Estado: " + gato1.getEstado());
        gato1.DisparaGato();
        System.out.println("Estado: " + gato1.getEstado());
        //

        System.out.println(gato1.getPeso());
        System.out.println(gato1.getHambre());


        gato1.AlimentaGato();

        System.out.println(gato1.getPeso());
        System.out.println(gato1.getHambre());

        gato1.AlimentaGato();
        System.out.println("Estado: " + gato1.getEstado());
    }
}