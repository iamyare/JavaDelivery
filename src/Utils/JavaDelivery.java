package Utils;

import java.util.ArrayList;
import java.util.List;

public class JavaDelivery {
    public List<Comercios> Categoria;
    public double subtotal;
    public double delivery;
    public double total;


    public int no = 1;
    public JavaDelivery() {

        this.Categoria = new ArrayList<Comercios>();
    }

    public void add_category(Comercios cc){
        this.Categoria.add(cc);
    }

    public void getMarkets(String categoria){
        System.out.println("\nFiltro: Categoria: "+categoria);

        int size=Categoria.size();
            for(int x=0;x<size;x++) {

            if(Categoria.get(x).categoria.compareTo(categoria)==0){
                this.Categoria.get(x).imprimir();

            }   else
                 no +=1;
        }if (no>10)
            System.out.println("No se han encontrado coincidencias con "+categoria+"\n");

    }

    public void factura(Cliente c){
        int size=c.productos.size();
        double delivery = 70*size;
        double acumulador = 0.0;
        for(Productos p: c.productos){
            acumulador += p.precio * p.cantidad;
        }
        this.subtotal = acumulador;
        this.delivery = delivery;
        this.total = this.subtotal + this.delivery;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tSubTotal:\t$"+(this.subtotal));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tDelivery:\t$"+(this.delivery));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t   Total:\t$"+(this.total));


    }


}
