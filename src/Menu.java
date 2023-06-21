import java.util.Scanner;
public class Menu {
    static Jaguar animal1 = new Jaguar(2.2F,"rojizo","Alta");
    static Pantera animal2 = new Pantera(1.2F,"negro", "Alta");
    static Leon animal3 = new Leon(2.1F,"Amarillento","Alta");
    static Bombay animal4 = new Bombay(0.56F,"Negro","Baja");
    static AzulRuso animal5 = new AzulRuso(0.30F,"Azul","Baja");
    static Sphynx animal6 = new Sphynx(0.25F,"Marron claro","Baja");

    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
        while (opcion != 7){
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("Jaguar");
                    animal1.imprimir();
                    animal1.cazar();
                    animal1.trepar();
                    break;
                case 2:
                    System.out.println("Pantera");
                    animal2.imprimir();
                    animal2.cazar();
                    animal2.correr();
                    animal2.rugir();
                    break;
                case 3:
                    System.out.println("Leon");
                    animal3.imprimir();
                    animal2.cazar();
                    animal2.correr();
                    animal2.rugir();
                    break;
                case 4:
                    System.out.println("Bombay");
                    animal4.imprimir();
                    animal4.cazar();
                    animal4.correr();
                    animal4.ronronear();
                    break;
                case 5:
                    System.out.println("Azul Ruso");
                    animal5.imprimir();
                    animal5.cazar();
                    animal5.correr();
                    animal5.ronronear();
                    break;
                case 6:
                    System.out.println("Sphynx");
                    animal6.imprimir();
                    animal6.cazar();
                    animal6.correr();
                    animal6.ronronear();
                    break;
                case 7:
                    System.out.println("Saliendo ...");
                    break;
                default:

            }
        }
    }
    public static int menuPrincipal(){
        System.out.println("\n---------- Menú de Felinos ---------\n");
        System.out.println("En este menu contamos con 6 felinos de diferentes especies\n");
        System.out.println("1. Jaguar ");
        System.out.println("2. Pantera");
        System.out.println("3. León ");
        System.out.println("4. Bombay ");
        System.out.println("5. Azul Ruso ");
        System.out.println("6. Sphynx ");
        System.out.println("7. Salir \n");
        System.out.print("Selecione una opción: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 7) {
            System.out.println("\n=================================================================================\n");
            System.out.println("!!Ingrese una opción válida¡¡");
            System.out.println("=================================================================================\n");
            System.out.println("\nPor favor vuelva a intentarlo");
            System.out.println("=================================================================================\n");
            opcion = menuPrincipal();
        }
        return opcion;
    }
}
