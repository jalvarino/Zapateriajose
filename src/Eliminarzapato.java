import java.util.InputMismatchException;
import java.util.Scanner;

public class Eliminarzapato {
    public static void eliminarzapato(Scanner scanner) {

        System.out.println("0. Regresar a menu admin");
        System.out.println("Nombre del zapato a eliminar: ");
        String nombre = scanner.next();
        if (nombre.equals("0")){
            Menuadmin.menuadmin();
        }
        System.out.println("Modelo del zapato a eliminar: ");
        String modelo = scanner.next();
        if (modelo.equals("0")){
            Menuadmin.menuadmin();
        }
        for (Zapatos zapatos : Zapatos.listaZapatos) {
            if (nombre.equals(zapatos.getNombre()) && modelo.equals(zapatos.getModelo())) {
                System.out.println("El zapato " + nombre + " y modelo " + modelo + " ha sido eliminado exitosamente del inventario");
            }
        }
        Zapatos.listaZapatos.removeIf(zapatos -> zapatos.getNombre().equals(nombre)&&zapatos.getModelo().equals((modelo)));

        for (Zapatos zapatos : Zapatos.listaZapatos) {
            if (nombre != zapatos.getNombre() && modelo != zapatos.getModelo()) {
                System.out.println("Zapato no encontrado.");
            }
        }
    }
}
