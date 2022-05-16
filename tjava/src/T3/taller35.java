package T3;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class taller35 {


    public static void main(String[]args){

        int eleccion;
        boolean salir=false;
        String nombre = null;

        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);


        while (!salir){
            System.out.println("1. Captura nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            eleccion=input.nextInt();
            switch (eleccion){
                case 1:
                    System.out.println("Escribe tu nombre?");
                    nombre=input2.nextLine();
                    break;
                case 2: System.out.println("Hola "+nombre);

                break;
                case 3:
                    System.out.println("Hasta pronto");
                    salir=true;
        }
    }
}}
