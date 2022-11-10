public class Gato {
    private String nombre;
    private boolean estado;
    private String color;
    private double peso;

    private boolean hambre;

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
         }
         else if(Math.random()>0.7){
            System.out.println(this.nombre + " ha muerto :(");
            this.estado = false;
        }else {
            System.out.println(this.nombre + " ha sobrevivido :)");
        }
    }

    public void AlimentaGato(){
        if(!this.estado){
            System.out.println(  "No puedes alimentar a "+ this.nombre + ", esta muerto :(");
        }

        else if(!this.hambre){
            System.out.println( this.nombre + " ya no tiene hambre");
            this.peso += 1;
            this.hambre = true;

        }else {
            System.out.println(this.nombre + " ha muerto por obesidad");
            this.estado = false;
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
    public String getEstado(){
        if(this.estado)return "Vivo";
        else return "Muerto";
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
    public String  getHambre(){
        if(!this.estado)  return "esta muerto";
        if(!this.hambre ) return  "Hambriento";
        else return  "Alimentado";
    }
    public void setHambre(boolean hambre){
        this.hambre = hambre;
    }
}

