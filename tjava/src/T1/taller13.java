package T1;

import java.util.Scanner;

public class taller13 {
    private static String name;
    private static String fathername;
    private static String mothername;

    public taller13() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre completo");
        name = input.nextLine();
        System.out.println("Escriba el nombre de su madre");
        mothername = input.nextLine();
        System.out.println("Escriba el nombre de su padre");
        fathername = input.nextLine();
        System.out.println("Yo " + name + " soy hijo de " + fathername + " y " + mothername);
    }
}