import java.util.ArrayList;
import java.util.List;

public class Zapatos {
    static List<Zapatos> listaZapatos = new ArrayList<>();
    private String nombre;
    private String color;
    private String marca;
    private String modelo;
    private int talla;
    private int stock;


    public Zapatos(String nombre, String color, String marca, String modelo, int talla, int stock) {
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.stock = stock;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getTalla() { return talla; }

    public void setTalla(int talla) {
        this.talla = talla;
    }




    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
