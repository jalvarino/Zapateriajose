import java.util.InputMismatchException;
import java.util.Scanner;

public class Agregarzapato {
    public static void agregarzapato(Scanner scanner) {

        System.out.println("0. Regresar a menu admin");
        System.out.println("Nombre del zapato: ");
        String nombre = scanner.next();
        if (nombre.equals("0")){
            Menuadmin.menuadmin();
        }


        for (Zapatos zapatos : Zapatos.listaZapatos) {

            if (zapatos.getNombre().equals(nombre)) {

                System.out.println("El zapato " + nombre + " ya está registrado actualmente ");
                Menuadmin.menuadmin();
            }
        }
        System.out.println("Color del zapato: ");
        String color = scanner.next();
        if (color.equals("0")){
            Menuadmin.menuadmin();
        }
        System.out.println("Marca del zapato: ");
        String marca = scanner.next();
        if (marca.equals("0")){
            Menuadmin.menuadmin();
        }
        System.out.println("Modelo del zapato: ");
        String modelo = scanner.next();

        if (modelo.equals("0")){
            Menuadmin.menuadmin();
        }
        System.out.println("Talla del zapato: ");

        int talla;
        try {
            talla = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR::Entrada invalida. La talla debe ser numero.");
            scanner.next();
            return;
        }
        if (talla == 0){
            Menuadmin.menuadmin();
        }

        System.out.println("Disponibilidad del zapato: ");
        int stock;
        try {
            stock = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR::Entrada invalida. La disponibilidad debe ser numero.");
            scanner.next();
            return;
        }
        if (stock == 0){
            Menuadmin.menuadmin();
        }

        Zapatos.listaZapatos.add(new Zapatos(nombre, color, marca, modelo, talla, stock));
    }
}
