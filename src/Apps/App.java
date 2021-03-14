package Apps;

import Utils.*;

public class App {
    public static void main(String[] args) {
        //Creacion de comercio
        Comercios negocio1 = new Comercios("Wendys","Comidas Rapidas");
        Comercios negocio2 = new Comercios("Burger King","Comidas Rapidas");
        Comercios negocio3 = new Comercios("Bigos","Comidas Rapidas");
        Comercios negocio4 = new Comercios("KFC","Comidas Rapidas");
        Comercios negocio5 = new Comercios("Popeyes","Comidas Rapidas");
        Comercios negocio6 = new Comercios("Pizza Hut","Comidas Rapidas");
        Comercios negocio7 = new Comercios("Asados el gordo","Restaurante");
        Comercios negocio8 = new Comercios("Hacienda Real","Restaurante");
        Comercios negocio9 = new Comercios("La cumbre","Hotel");
        Comercios negocio10 = new Comercios("El Patio","Hotel");

        //Creaccion de la comida
        Productos f1 = new Productos("Baleadas","Tortilla de harina con frijoles.",20.99,2);
        Productos f3 = new Productos("Hamburguesa","Doble carne",120,1);
        Productos f4 = new Productos("Pizza","Peperonis, salsa",99.99,2);
        Productos f5 = new Productos("Pollo","Pollo empanizado.",220.99,3);
        Productos f7 = new Productos("Sandwitch","Doble jamon",60.45,4);
        Productos f8 = new Productos("HotDog","Extra grande",99.99,2);
        Productos f9 = new Productos("Paste;","Pastel de limón.",20.99,5);
        Productos f10 = new Productos("Pan de ajo","Pan con pimientas.",40.89,3);
        Productos f11 = new Productos("Pupusas","Mixtas",120.25,5);
        Productos f12 = new Productos("Arroz con Leche","Arroz con leche caliente",99.99,1);
        Productos f13 = new Productos("Pinchos","Carne de res y cerdo.",120.99,3);
        Productos f14 = new Productos("Filete","Filete con verduras.",130.49,2);
        Productos f15 = new Productos("Langosata","Extra grande con...",220,1);
        Productos f16 = new Productos("Espaguettis","Espaguettis en salsa roja",199.99,1);
        Productos f17 = new Productos("Pastel de carne","con carne de res.",220.99,1);
        Productos f18 = new Productos("Sopa Marinera","Sopa con cangrejo.",150.89,2);
        Productos f19 = new Productos("Almuerzo","Carne de Res, carne de cerdo",220,2);
        Productos f20 = new Productos("Desayuno","Frijoles, platano",199.99,2);

        //Creacion del cliente
        Cliente ClienteA = new Cliente("Yamir Rodas");
        Cliente ClienteB = new Cliente("Juan Pablo");

        //Asignacion de comidas
        //negocio1
        negocio1.add_foot(f1);
        //negocio2
        negocio2.add_foot(f3);
        //negocio3
        negocio3.add_foot(f7);
        //negocio4
        negocio4.add_foot(f17);
        //negocio5
        negocio5.add_foot(f5);;
        //negocio6
        negocio6.add_foot(f4);
        //negocio7
        negocio7.add_foot(f13);
        //negocio8
        negocio8.add_foot(f16);
        //negocio9
        negocio9.add_foot(f19);
        //negocio10
        negocio10.add_foot(f11);


        //Busqueda por categorias
        JavaDelivery minegocio = new JavaDelivery();
        minegocio.add_category(negocio1);minegocio.add_category(negocio2);minegocio.add_category(negocio3);minegocio.add_category(negocio4);minegocio.add_category(negocio5);minegocio.add_category(negocio6);minegocio.add_category(negocio7);minegocio.add_category(negocio8);minegocio.add_category(negocio9);minegocio.add_category(negocio10);
        System.out.println("\nBuscar por categorias");
        minegocio.getMarkets("Comidas Rapidas"); //Comidas Rapidas, Restaurante, Hotel.
        minegocio.getMarkets("Comidas Chinas"); //Esta clasificacion no existe

        //Impresion del menu
        negocio1.menu();negocio2.menu();

        //Cliente selecciona comida
        ClienteA.add_car(f13);
        ClienteB.add_car(f1);ClienteB.add_car(f3);

        //Impresion de la comida elegida
        ClienteA.carrito();
        minegocio.factura(ClienteA);
        ClienteB.carrito();
        minegocio.factura(ClienteB);




    }
}
