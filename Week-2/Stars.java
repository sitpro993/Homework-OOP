import java.util.Scanner;

public class Stars {
    public static void main(String[] args){
        System.out.print("Height of stars: ");
        int n = new Scanner(System.in).nextInt();
        int i,j,k;
        for (i = 0; i < n; i++){
            for(k = 1; k < n - i; k++){
                System.out.print(" ");
            }
            for (j = 1; j <= 2*i + 1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
