package T1;

import java.util.Scanner;

public class taller14 {
    private static String capital;
    private static String pais;

    public taller14() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el nombre el pais");
        pais = input.nextLine();
        System.out.println("Escriba el nombre la capital");
        capital = input.nextLine();
        System.out.println("La ciudad de " + capital + " es la capital de " + pais);
    }
}
