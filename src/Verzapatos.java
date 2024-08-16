public class Verzapatos {
    public static void verzapatos() {
        for (Zapatos zapatos : Zapatos.listaZapatos) {
            System.out.println("\n" + zapatos);
            System.out.println("Nombre: " + zapatos.getNombre());
            System.out.println("Color: " + zapatos.getColor());
            System.out.println("Marca: " + zapatos.getMarca());
            System.out.println("Modelo: " + zapatos.getModelo());
            System.out.println("Talla: " + zapatos.getTalla());
            System.out.println("Unidades disponibles (stock) : " + zapatos.getStock());
        }
    }
}

