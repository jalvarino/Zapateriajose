import java.util.InputMismatchException;
import java.util.Scanner;

public class Editarzapato {


    public static void editarzapato(Scanner scanner) {
        System.out.println("Nombre del zapato a editar: ");
        String nombrebusqueda = scanner.next();
        for (Zapatos zapatos : Zapatos.listaZapatos) {
            if (zapatos.getNombre().equals(nombrebusqueda)) {
                int opcion;

                do {
                    System.out.println("MENU");
                    System.out.println("Está en el menú de edición del zapato " + zapatos.getNombre() + ", que desea editar?");
                    System.out.println("1. Color");
                    System.out.println("2. Marca");
                    System.out.println("3. Modelo");
                    System.out.println("4. Talla");
                    System.out.println("5. Stock");
                    System.out.println("6. Regresar a menu de admin");
                    System.out.print("\nOPCION: ");
                    try {
                        opcion = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        opcion = 100;
                        scanner.next();
                    }

                    switch (opcion) {
                        case 1:
                            System.out.println("Introduce el nuevo color: ");
                            String color = scanner.next();
                            zapatos.setColor(color);
                            System.out.println("Se ha modificado el color del zapato " + zapatos.getNombre() + " al color " + color);
                            return;
                        case 2:
                            System.out.println("Introduce la nueva marca: ");
                            String marca = scanner.next();
                            zapatos.setMarca(marca);
                            System.out.println("Se ha modificado la marca del zapato " + zapatos.getNombre() + " a la marca " + marca);
                            return;
                        case 3:
                            System.out.println("Introduce el nuevo modelo: ");
                            String modelo = scanner.next();
                            zapatos.setModelo(modelo);
                            System.out.println("Se ha modificado el modelo del zapato " + zapatos.getNombre() + " al modelo " + modelo);
                            return;
                        case 4:
                            System.out.println("Introduce la nueva talla: ");
                            int talla;
                            try {
                                talla = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. La talla debe ser numero.");
                                scanner.next();
                                return;
                            }
                            zapatos.setTalla(talla);
                            System.out.println("Se ha modificado la talla del zapato " + zapatos.getNombre() + " a la talla " + talla);
                            return;
                        case 5:
                            System.out.println("Introduce la nueva disponibilidad: ");
                            int stock;
                            try {
                                stock = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("ERR::Entrada invalida. La disponibilidad debe ser numero.");
                                scanner.next();
                                return;
                            }
                            zapatos.setStock(stock);
                            System.out.println("Se ha modificado la disponibilidad del zapato " + zapatos.getNombre() + " a " + stock + " Disponibles");
                            return;
                        case 6:
                            Menuadmin.menuadmin();
                        default:
                            System.out.println("ERR::Opcion invalida");
                    }
                } while (opcion != 6);


            }
        }
        System.out.println("Zapato no encontrado.");
    }
}