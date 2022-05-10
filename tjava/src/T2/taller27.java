package T2;
/*La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal) y
requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados,
debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class taller27 {


    public static int eleccion;
    public static double altura, imc;
    public static int peso;
    private static String name;


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Calculadora IMC");
     System.out.println("Indique peso en KG"); peso=input.nextInt();
     System.out.println("Indique altura en metros"); altura=input.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");

     if (peso> 0 &&  altura<3){imc= (peso/Math.pow(altura,2)); }
     else {System.out.println("Los valores ingresados no estan en KG o en metros.");}
     if (imc <= 18.5){System.out.println("Su imc es de "+df.format(imc)+": Bajo");} if (imc >= 18.5 & imc<=24.5){System.out.println("Su imc es de "+df.format(imc)+": Normal");}
     if (imc >= 25 & imc<=29.9){System.out.println("Su imc es de "+df.format(imc)+": Sobrepeso");} if (imc >= 30){System.out.println("Su imc es de "+df.format(imc)+": Obesidad");}


    }}
