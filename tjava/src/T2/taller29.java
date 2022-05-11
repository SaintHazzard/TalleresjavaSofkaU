package T2;
/* El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes
    figuras geométricas, para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores al
    estudiante. La aplicación debe permitir que el estudiante seleccione si desea calcular el área de un rectángulo,
    triángulo o trapecio. No olvide solicitar los datos necesarios para realizar cada cálculo y mostrar su respectivo resultado.*/


import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class taller29 {
    private static String fig2="Triangulo";
    private static String fig1="Rectangulo";
    private static String fig3= "Trapecio";

    private static int eleccion, valor1, valor2,valor3, area;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("De cual figura desea calcular el area?");
        System.out.println("1. " + fig1);
        System.out.println("2. " + fig2);
        System.out.println("3. " + fig3);
        eleccion= input.nextInt();
        switch (eleccion){
            case 1: System.out.println("Indique la base del rectangulo"); valor1=input.nextInt();
            System.out.println("Indique la altura del rectangulo"); valor2=input.nextInt();
            area=valor1*valor2;
            System.out.println("El area de tu rectangulo es: " + area);
            break;
            case 2:System.out.println("Indique la base del triangulo"); valor1=input.nextInt();
                System.out.println("Indique la altura del triangulo"); valor2=input.nextInt();
                area=(valor1*valor2)/2;
                System.out.println("El area de tu triangulo es: " + area);
                break;
            case 3:System.out.println("Indique medida de un lado del trapecio"); valor1=input.nextInt();
                System.out.println("Indique la medida del otro lado del trapecio"); valor2=input.nextInt();
                System.out.println("Indique la altura del trapecio"); valor3=input.nextInt();
                area=((valor1+valor2)*valor3)/2;
                System.out.println("El area de tu trapecio es: " + area);
                break;
        }

    }
}




