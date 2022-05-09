package taller2;
import java.util.Scanner;

public class taller23 {

    private static int edad;
    private static String name;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Cual es su nombre?");
        name=input.nextLine();
        System.out.println("Cual es su edad");
        edad=input.nextByte();
        if (edad>=18){
            System.out.println(name+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");}
        else
            System.out.println(name+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");}







}

