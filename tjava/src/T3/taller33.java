package T3;

public class taller33 {

    public static void main(String[]args){
        int i=0;
        int k=10;
        int contadoras=9;
        int l=10;

        do {
        do {
            System.out.print(" ");
            i++;
                    } while (i<=k);





            do {
                System.out.print("*");

                 i++;

            } while (i<=l*2-contadoras);
                        /*  0<=1    */
                        /* 12<=11   */
            i=0;
            contadoras--;





/*Repetir
			Escribir Sin Saltar "*";
			contador<-contador+1;

		Hasta Que contador>=10-contadoras*/

        System.out.println(" ");

        k--;

        }while (0<=k);

        for (int espacio=0; espacio <= 9; espacio++){
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        for (int espacio=0; espacio <= 9; espacio++){
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        for (int espacio=0; espacio <= 8; espacio++){
            System.out.print(" ");
        }
        System.out.print("*****");
        System.out.println();
        for (int espacio=0; espacio <= 7; espacio++){
            System.out.print(" ");
        }
        System.out.print("*******");


    }}

