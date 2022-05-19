package T4;

public class t44 {

    public static void main(String[]args){

        int matriz [][]={{01,02,03,04,05},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        for (int i = 0; i <= 0; i++) {
            for (int k = 0; k <=4; k++) {
                System.out.print(matriz[i][k]);
                System.out.print("  ");
            }
        }System.out.println("");
        for (int i = 1; i <= 1; i++) {
            for (int k = 0; k <=3; k++) {
                System.out.print("0"+matriz[i][k]);
                System.out.print(" ");
            }
            System.out.println(matriz[1][4]);
        }

        for (int i = 2; i <= 3; i++) {
            for (int k = 0; k <=4; k++) {
                System.out.print(+matriz[i][k]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}
