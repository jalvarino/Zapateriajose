import java.util.InputMismatchException;
import java.util.Scanner;

public class Menucliente {
    public static void menucliente(Scanner args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE CLIENTE");
            System.out.println("1. Ver zapatos");
            System.out.println("2. Comprar zapato");
            System.out.println("3. Regresar a zapatería (menu principal)");
            System.out.print("\nOPCION: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcion = 100;
                scanner.next();
            }

            switch (opcion) {
                case 1:
                    Verzapatos.verzapatos();
                    break;
                case 2:
                    Comprarzapato.comprarzapato(scanner);
                    break;
                case 3:
                    Mainmenu.mainmenu();
                default:
                    System.out.println("ERR::Opcion invalida");
            }
        } while (opcion != 3);
    }
}
