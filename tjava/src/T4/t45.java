package T4;

import java.util.Random;
import java.util.Scanner;

public class t45 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[10][10];
        int[][] matriz3 = new int[10][10];
        int[] columnas = new int[10];
        String[] filas={"F","I","L","A","S"};

        int fila, columna;
        int k=1;
        int i=1;
        int a=1;







        for ( i = 0; i <= 9; i++) {
            for ( k = 0; k <=9; k++) {
                matriz1[i][k] = a;
                a++;
            }
a=1;
        }

        for ( i = 0; i <= 9; i++) {
            for ( k = 0; k <= 9; k++) {
                matriz2[i][k] = a ;
            }
a++;

        }
        for ( i = 0; i < 10; i++) {
            for ( k = 0; k < 10; k++) {
                matriz3[i][k]=matriz1[i][k]*matriz2[i][k];
            }
        }

        System.out.println("              C   O     L    U      M      N     A      S");

        for (i=0; i<10;i++){
            columnas[i]=i;
        }
        System.out.print("    ");
        for (i=0; i<10;i++){
            System.out.print("  "+columnas[i]+"      ");
        }
        System.out.println("");
        System.out.println("  |--------------------------------------------------------------------------------------|");


        //Armando tabla hasta 9
        for ( i = 0; i <9; i++) {
            for ( k = 0; k < 10; k++) {
                if (k<1){System.out.print(columnas[i]+" | "+matriz1[i][k]+"*"+matriz2[i][k]+"|");
                    System.out.print(" ");}
                else {
                    System.out.print(" | "+matriz1[i][k]+"*"+matriz2[i][k]+" |");
                    System.out.print(" ");
                }

            }
            System.out.println("");
            System.out.println("  |--------------------------------------------------------------------------------------|");
        }
        for ( i = 0; i <9; i++) {
            for ( k = 0; k < 10; k++) {
                if (k<1){System.out.print(columnas[i]+" | "+matriz1[i][k]+"*"+matriz2[i][k]+"|");
                    System.out.print(" ");}
                else {
                    System.out.print(" | "+matriz1[i][k]+"*"+matriz2[i][k]+" |");
                    System.out.print(" ");
                }

            }
            System.out.println("");
            System.out.println("  |--------------------------------------------------------------------------------------|");
        }
        //tabla nivel 10

        for ( i = 0; i < 10; i++) {
            for ( k = 9; k <10; k++) {
                if (i==0 && k==9){System.out.print(columnas[k]+" |"+matriz1[i][k]+"*"+matriz2[i][k]+"|");
                    System.out.print(" ");}
                else {
                    System.out.print(" | "+matriz2[i][k]+"*"+matriz1[i][k]+"|");
                    System.out.print(" ");
                }

            }

        }




        System.out.println("");
        System.out.println("  |--------------------------------------------------------------------------------------|");
        System.out.println("");
        for ( i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
                System.out.print(matriz1[i][k]);
System.out.print(" ");
            }
            System.out.println("");

        }
        for ( i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
                System.out.print(matriz2[i][k]);
                System.out.print(" ");
            }
            System.out.println("");

        }
        Scanner sn=new Scanner(System.in);
        System.out.println("Indique fila");
        fila=sn.nextInt();
        System.out.println("Indique colunna");
        columna=sn.nextInt();
        System.out.println(matriz3[fila][columna]);




    }
}

