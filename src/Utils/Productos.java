package Utils;

import java.util.ArrayList;
import java.util.List;

public class Productos {
    public String name_product;
    public String descripcion;
    public double precio;
    public int cantidad;


    public Productos(String name, String description, double price, int cantidad) {
        this.name_product = name;
        this.descripcion = description;
        this.precio = price;
        this.cantidad = cantidad;


    }
    public void impresion(){
        System.out.println("-\t"+this.name_product+"\t"+this.descripcion+"\tPrecio:\t$"+String.valueOf(this.precio)+"\tCantidad:\t"+String.valueOf(this.cantidad)+"\tTotal $\t"+String.valueOf(this.cantidad*this.precio));
    }

}
