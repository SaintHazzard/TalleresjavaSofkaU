package T2;
/*El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones y
requiere una aplicación que le permita registrar los servicios generados a sus clientes. Para cada motocicleta
se debe tener registro del ingreso al taller y las observaciones por parte del cliente. También debe existir registro de
 del taller con las novedades y otra de arreglos hechos por el mecánico en caso de que se requiera inventariar cambios
 repuestos en la motocicleta al entregarla.
 */


import java.util.Date;
import java.util.Scanner;

public class taller26 {
    public static int eleccion;
    public static boolean salir=false;
    public static int carrito=0;
    private static String name,anotacion, anotacion1, anotacion2;


    public static void main(String[] args) { Scanner input=new Scanner(System.in);Date fechaactual= new Date(); Scanner input1=new Scanner(System.in);
        System.out.println("1. Registrar entrada de motocicleta");
        System.out.println("2. Registrar salida de motocicleta");
        eleccion=input1.nextByte();
        switch (eleccion){case 1: System.out.println("Indique observaciones por parte del cliente");
            anotacion=input.nextLine();
            System.out.println("Motocicleta registrada: " +fechaactual); System.out.println("Obvservaciones del cliente: "+anotacion);
            break;
            case 2:System.out.print("Resumen acciones efectuadas: "); anotacion1=input.nextLine(); System.out.println("Codigo de los productos que necesito la operacion: "); anotacion2=input.nextLine();
            System.out.println("Se registra salida de la motocicleta el "+fechaactual +" el mecanico indica los trabajos realizados: "+anotacion1);
            System.out.println("El trabajo requirio los siguientes productos "+anotacion2);
            break;
        }



}}
