package Utils;

import java.util.ArrayList;
import java.util.List;

public class Comercios {
    public String nombre_comercios;

    public String categoria;


    public List<Productos> menu;

    public Comercios(String name, String categoria) {
        this.nombre_comercios = name;
        this.categoria = categoria;
        this.menu = new ArrayList<Productos>();
    }
    public void add_foot(Productos p){
        this.menu.add(p);

    }
    public void menu(){
        System.out.println("\t\t\t\t\t\t\t"+this.nombre_comercios);
        System.out.println("\t\t\t\t\t\t\tMENU");
        for (Productos p: this.menu){
            p.impresion();
        }
        System.out.println("");
    }

    public void imprimir(){
        System.out.println(this.nombre_comercios);
    }




}
