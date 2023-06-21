public class Felinos {
    float tamano;
    String correr;
    String ronronear;


    //Constructor super
    public Felinos(){
        super();
    }
    //Constructor
    public Felinos(float tamano, String correr, String ronronear) {
        this.tamano = tamano;
        this.correr = correr;
        this.ronronear = ronronear;
    }


    //Setters and getters
    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }

    public String getRonronear() {
        return ronronear;
    }

    public void setRonronear(String ronronear) {
        this.ronronear = ronronear;
    }
    public void cazar(){
        System.out.println("Este es el método cazar");
    }
    public void correr(){
        System.out.println("Este es el método correr");
    }
    public void rugir(){
        System.out.println("Este es el método rugir");
    }
}
