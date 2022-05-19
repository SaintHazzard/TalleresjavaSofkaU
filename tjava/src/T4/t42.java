package T4;

import java.util.Random;

public class t42 {
    public static void main(String[] args) {

        Random azar = new Random();
        int[][] matriz = new int[5][4];
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <=3; k++) {
                matriz[i][k] = azar.nextInt(1,100);
            }
        }

System.out.print("Numeros pares:");
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <= 3; k++) {
                if(matriz[i][k]%2==0){
                    System.out.print(matriz[i][k]);
                    System.out.print(" ");
                }

            }
        }
        System.out.println("");
        System.out.print("Numeros impares:");

        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <= 3; k++) {
                if(matriz[i][k]%2==1){
                    System.out.print(matriz[i][k]);
                    System.out.print(" ");
                }

            }
        }
    }
}


