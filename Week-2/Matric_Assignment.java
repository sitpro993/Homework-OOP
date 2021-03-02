import java.util.Scanner;

public class Matric_Assignment {
    public static void main(String[] args){
        System.out.print("Number of column: ");
        int x = new Scanner(System.in).nextInt();
        System.out.print("Number of row: ");
        int y = new Scanner(System.in).nextInt();

        int[][] a = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print("a[" + i +"][" + j + "] = " );
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.print("Matric: ");
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
