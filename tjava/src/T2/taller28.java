package T2;
/* El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que le permita registrar los
pedidos de los clientes en cuanto a las tortas que realiza. Cada torta tiene unas características propias como sabor,
cantidad (porciones) y decoraciones). Se requiere que la aplicación permita registrar los pedidos, las tortas disponibles
y las ventas que se registren diariamente. */

import java.util.Scanner;

public class taller28 {
    public static int eleccion;
    public static double altura, imc;
    public static int precio;
    private static String name,sabor,tamanio, decoracion, rventa;
    private static boolean salir = false;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("1. Registrar pedido"); System.out.println("2. Tortas disponibles para entrega inmediata"); System.out.println("3. Registrar venta(Sabor/tamamio/decoracion");
        eleccion=input.nextByte();
        switch (eleccion){

            case 1: System.out.println("Sabor de la torta: ");
            System.out.println("1. Mora"); System.out.println("2. Chocolate"); System.out.println("3. Tres leches"); eleccion=input.nextByte();

            System.out.println("1. Grande"); System.out.println("2. Mediana"); System.out.println("3. Pequenia"); eleccion=input.nextByte();

            System.out.println("1. Dibujo con boceto del cliente"); System.out.println("2. Estandar"); System.out.println("3. Frutal"); eleccion=input.nextByte();
            System.out.println("Pedido registrado con exito");
        case 2: System.out.println("Tres leches/Pequenia/Estandar"); System.out.println("Tres leches/Grande/Estandar"); System.out.println("Crema y amapola/Grande/Estandar");


        case 3: System.out.println("Indique sabor, tamanio y decoracion respectivamente"); rventa=input2.nextLine(); System.out.println("Precio de venta al cliente"); precio=input.nextInt();
            System.out.print("Caracteristicas de la torta: "+rventa); System.out.println(" / Precio de la torta: "+precio);






}}}
