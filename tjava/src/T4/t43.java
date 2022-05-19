package T4;

public class t43 {

    public static void main(String[]args){
        int primo=0;
        for (int i=0;i<=1000;i++){
            for (int k=1;k<=i;k++){
                if (i%k==0){
                    primo++;
                }
            }
            if (primo==2){
                System.out.print(i);
                System.out.print(" ");
            }
            primo=0;
        }
    }
}
