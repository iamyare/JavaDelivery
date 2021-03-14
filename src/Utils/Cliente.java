package Utils;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String name;
    public List<Productos> productos;
    public int id;


    public Cliente(String name) {
        this.id = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
        this.name = name;
        this.productos = new ArrayList<Productos>();

    }
    public void add_car(Productos cc){
        this.productos.add(cc);

    }

    public void carrito(){
        System.out.println("\t\t\t\t\t\t\t\t\tOrden #\t"+String.valueOf(this.id));
        System.out.println(this.name+"! su carrito contiene: ");
        for (Productos p: productos){

            p.impresion();

        }
    }


}
