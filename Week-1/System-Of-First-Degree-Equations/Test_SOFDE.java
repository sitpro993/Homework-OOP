import java.util.Scanner;

public class Test_SOFDE {
    public static void main(String[] args){
    double a11, a12, b1, a21, a22, b2;
        System.out.println("Enter the values for the program: ");
        System.out.print("a11 = ");
    a11 = new Scanner(System.in).nextDouble();
        System.out.print("a12 = ");
    a12 = new Scanner(System.in).nextDouble();
        System.out.print("b1 = ");
    b1 = new Scanner(System.in).nextDouble();
        System.out.print("a21 = ");
    a21 = new Scanner(System.in).nextDouble();
        System.out.print("a22 = ");
    a22 = new Scanner(System.in).nextDouble();
        System.out.print("b2 = ");
    b2 = new Scanner(System.in).nextDouble();
        SystemOfFirstDegreeEquations eq = new SystemOfFirstDegreeEquations(a11,a12,b1,a21,a22,b2);
    System.out.println(eq.resolve());
    }
}


