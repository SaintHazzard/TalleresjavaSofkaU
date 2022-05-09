package T1;


import java.util.Scanner;

public class taller15 {
    private static String npet;
    private static String nameme;
    private static String typepet;
    private static int agepet;

    public taller15() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nombre de la mascota");
        npet = input.nextLine();
        System.out.println("Tipo de la mascota");
        typepet = input.nextLine();
        System.out.println("Edad de la mascota");
        agepet = input.nextInt();
        System.out.println("Nombre del duenio");
        nameme = input.next();
        System.out.println(npet + " es un(a) " + typepet + " el cual, tiene " + agepet + " anios de edad y " + nameme + " es actualmente su duenio(a)");
    }
}