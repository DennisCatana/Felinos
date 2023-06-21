public class Felinos {
    float tamano;
    String color;
    String velocidad;

    public Felinos(){
    }

    public Felinos(float tamano, String color, String velocidad) {
        this.tamano = tamano;
        this.color = color;
        this.velocidad = velocidad;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String fuerza) {
        this.velocidad = fuerza;
    }

    public void cazar(){
        System.out.println("El animal sabe cazar");
    }

    public void correr(){
        System.out.println("El animal sabe correr");
    }

    public void rugir(){
        System.out.println("El animal sabe rugir");
    }
    public void imprimir(){
        System.out.println("Tiene un color: "+this.color);
        System.out.println("Tiene un tamaño de: "+this.tamano+" metros");
        System.out.println("La velocidad de este animal es: "+this.velocidad);
    }
}
