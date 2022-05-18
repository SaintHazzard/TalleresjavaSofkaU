package T3.taller37;

import java.util.Scanner;

public class taller37 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int eleccion, telefono;
        String placa, marca, nombre;
        atributos c;
        datos registro= new datos();


        boolean salir = false;

        while (!salir) {
            System.out.println("1. Registrar entrada de vehiculo");
            System.out.println("2. Registrar salida de vehiculo");
            System.out.println("3. Buscar por placa");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.println("Escribe una de las opciones");
            eleccion = sn.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("Placa del vehiculo");
                    placa=sn.next();
                    System.out.println("Marca del vehiculo");
                    marca=sn.next();
                    System.out.println("Nombre del titular");
                    nombre=sn.next();
                    System.out.println("Telefono del titular");
                    telefono=sn.nextInt();
                    c=new atributos(placa,marca,nombre,telefono);
                    registro.aniadircarro(c);
                    break;
                case 2:
                    System.out.println("Placa del vehiculo");
                    placa=sn.next();
                    System.out.println("Nombre del titular");
                    nombre=sn.next();
                    c=new atributos(placa,nombre);
                    registro.retirarvehiculo(c);
                    break;
                case 3:
                    System.out.println("Placa del vehiculo");
                    placa=sn.next();
                    registro.buscarplaca(placa);
                    break;
                case 4:
                    registro.listarvehiculos();
                    break;
                case 5:
                    salir=true;


            }
        }
    }
}
