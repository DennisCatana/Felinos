import java.util.Scanner;
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static int opcion = 0;
    public static void main(String[] args) {
        while (opcion != 7){
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                case 4:
                    System.out.println("Caso 4");
                    break;
                case 5:
                    System.out.println("Caso 5");
                    break;
                case 6:
                    System.out.println("Caso 6");
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
            System.out.print("\nDígite la opción: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }
}
