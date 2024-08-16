import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainmenu {

    public static void mainmenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***BIENVENIDO A MI ZAPATERIA***");
            System.out.println("MENU");
            System.out.println("1. Administrador del almacén");
            System.out.println("2. Cliente");
            System.out.println("3. Salir");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    Menuadmin.menuadmin();
                    break;
                case 2:
                    Menucliente.menucliente(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 3);
    }
}
