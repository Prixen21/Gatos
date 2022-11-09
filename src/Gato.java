public class Gato {
    private String nombre;
    private boolean estado;
    private String color;
    private double peso;

    Gato(String nombre){
        this.nombre = nombre;
    }

    Gato(String nombre, boolean estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    Gato(String nombre, String color , boolean estado, double peso){
        this.nombre = nombre;
        this.color = color;
        this.estado = estado;
        this.peso = peso;
    }
    public void DisparaGato(){

         if(!this.estado){
             System.out.println( this.nombre + " ya esta muerto dejalo :(");
             return;
         }
         else if(Math.random()>0.2){
            System.out.println(this.nombre + " ha muerto :(");
            this.estado = false;
        }else {
            System.out.println(this.nombre + " ha sobrevivido :)");
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

