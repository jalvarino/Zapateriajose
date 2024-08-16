import java.util.InputMismatchException;
import java.util.Scanner;

public class Comprarzapato {
    public static void comprarzapato(Scanner scanner) {
        System.out.println("Nombre del zapato a comprar: ");
        String nombre = scanner.next();
        System.out.println("Modelo del zapato a comprar: ");
        String modelo = scanner.next();
        System.out.println("Color del zapato a comprar: ");
        String color = scanner.next();


        for (Zapatos zapatos : Zapatos.listaZapatos) {
            if (zapatos.getNombre().equals(nombre) && zapatos.getModelo().equals(modelo) && zapatos.getColor().equals(color)){
                System.out.println("Ha comprado exitosamente el zapato " + nombre + " de modelo " + modelo + " color "+ color + ".");
                int stock = zapatos.getStock();
                stock = stock - 1;
                zapatos.setStock(stock);
                Verzapatos.verzapatos();
                if(stock==0){
                    stock = stock + 20; //Si el inventario se agota, automaticamente agregará 20 adicionales del zapato vendido totalmente
                    zapatos.setStock(stock);
                }
                return;
            }else {
                System.out.println("Zapato no encontrado.");

            }
        }
    }
}
