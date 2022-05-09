package T2;

import java.lang.ref.Cleaner;
import java.util.Scanner;
/*La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los '\
productos que vende a sus clientes y para ello, los productos tienen unas características que deben indicársele al
cliente para que pueda escoger el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto,
consulta de precios por producto y devoluciones en caso de que se presenten.
*/

public class Taller25 {

    public static int eleccion;
    public static boolean salir=false;
    public static int carrito=0;
    private static String name, anotacion;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. Comprar producto");
        System.out.println("2. Consultar precios de los productos");
        System.out.println("3. Devolver productos");
        eleccion=input.nextByte();

        switch (eleccion){
            case 1:

                while (!salir){ System.out.println("1. Acetaminofen 500 mg x 10 capsulas"); System.out.println("2. Naproflash Capsulas Caja X 4 Capsulas");
                System.out.println("3. Lumbal Caja X 12 Tabletas"); System.out.println("4. Pagar");
                eleccion=input.nextByte();

                switch (eleccion){
                    case 1: carrito=carrito+1000; System.out.println(carrito); break; case 2: carrito=carrito+2000; System.out.println(carrito); break;
                    case 3: carrito=carrito+3000; System.out.println(carrito); break; case 4: salir=true;
                    System.out.println("Su compra fue por un total de: "+carrito);
                    break;}}break;




            case 2:{System.out.println("1. Acetaminofen 500 mg x 10 capsulas = 1000"); System.out.println("2. Naproflash Capsulas Caja X 4 Capsulas = 2000");
                System.out.println("3. Lumbal Caja X 12 Tabletas = 3000");} break;



                case 3: while (!salir){ System.out.println("1. Acetaminofen 500 mg x 10 capsulas"); System.out.println("2. Naproflash Capsulas Caja X 4 Capsulas");
                System.out.println("3. Lumbal Caja X 12 Tabletas"); System.out.println("4. Terminar devolucion");
                eleccion=input.nextByte();

                switch (eleccion){
                    case 1: carrito=carrito+1000; System.out.println(carrito); break; case 2: carrito=carrito+2000; System.out.println(carrito); break;
                    case 3: carrito=carrito+3000; System.out.println(carrito); break; case 4: salir=true;
                        System.out.println("Valor devolucion: " +carrito);
                        break;}}




}} }






