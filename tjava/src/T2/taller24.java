package T2;

import java.util.Scanner;




public class taller24 {

    private static int edad, eleccion;
    private static String name, anotacion;
    public static String pelicula1="Jumanji"; public static String pelicula2="Oblivion"; public static String pelicula3="interstellar";





    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar pelicula disponible");
        System.out.println("3. Recibir pelicula");


        System.out.println("Que pelicula deseas alquilar?");
        switch (eleccion){
            case 1 : System.out.println("1. "+pelicula1) ; System.out.println("2. "+pelicula2); System.out.println("3. "+pelicula3);
            eleccion=input.nextByte();

                switch (eleccion){
                    case 1:System.out.println("Alquilaste la pelicula "+pelicula1);
                        break; case 2:System.out.println("Alquilaste la pelicula "+pelicula2);break; case 3:System.out.println("Alquilaste la pelicula "+pelicula3);break;
                    }
                    break;

            case 2: System.out.println("Peliculas actualmente disponibles");
                System.out.println("1. "+pelicula3); System.out.println("2. "+pelicula2); System.out.println("3. "+pelicula3);
                break;
            case 3: System.out.println("Aniadir observacion sobre pelicula recibida? S/N");
                System.out.println("1. Si");
                System.out.println("2. No");
                eleccion=input.nextByte();
                switch (eleccion){
                    case 1:
                       anotacion=input.next();
                       System.out.println("Observaciones al recibir la pelicula: "+anotacion);
                       break;
                    case 2: System.out.println("Pelicula recibida sin novedades");
        }}




    }}





























