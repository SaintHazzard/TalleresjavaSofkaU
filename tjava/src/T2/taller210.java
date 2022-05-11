package T2;
/*El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para llevar las
cuentas de sus usuarios; por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad. Para cada cliente
las cuentas permitirán realizar ingresos, retiros o consultas de valor. En los ingresos no se pueden insertar valores negativos
y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.*/



import javax.swing.*;

import java.util.Scanner;

public class taller210 {


    private static int eleccion, ingreso;
    private static String name;
    private static JPasswordField passwordField;
    private static String pass;







    public static void main(String[] args){
        int balance= (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);
        Scanner input2=new Scanner(System.in);


        System.out.println("Nombre del titular de la cuenta");
        name=input2.nextLine();
        System.out.println("Ingrese su contrasenia de verificacion");

        pass= input2.nextLine();


        System.out.println("Bienvenido, "+name+" su balance actual es "+balance+", que desea hacer?");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        eleccion=input.nextByte();
        switch (eleccion){

            case 1: System.out.println("Que valor desea consginar?"); ingreso=input.nextInt();
            if (ingreso>0){balance=ingreso+balance; System.out.println("Su consignacion fue procesada, su nuevo balance es: "+balance);}
            else{System.out.println("Valor ingresado no valido, terminando transaccion por seguridad");}
            break;

            case 2:System.out.println("Que valor desea retirar?"); ingreso=input.nextInt();
                if (ingreso<=balance){balance=balance-ingreso; System.out.println("Su retiro fue procesado, su nuevo balance es: "+balance);}
                else{System.out.println("Valor ingresado no valido, terminando transaccion por seguridad");}
                break;






    }
}


    }




