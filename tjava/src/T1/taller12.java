package T1;

import java.util.Scanner;

public class taller12 {
    private static String name;
    private static String apellido;
    private static Double estatura;
    private static int edad;

    public taller12() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        name = input.nextLine();
        System.out.println("Escriba su apellido");
        apellido = input.nextLine();
        System.out.println("Escriba su edad");
        edad = input.nextInt();
        System.out.println("Escriba su altura en metros");
        estatura = input.nextDouble();
        System.out.println("Yo soy " + name + " " + apellido + " tengo " + edad + " y mido " + estatura);
    }
}