package T1;

import java.util.Scanner;

public class taller11 {
    private static String name;
    private static String apellido;
    private static Double estatura;
    private static int edad;

    public taller11() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        name = input.nextLine();
        System.out.println("Escriba su apellido");
        apellido = input.nextLine();
    }
}
