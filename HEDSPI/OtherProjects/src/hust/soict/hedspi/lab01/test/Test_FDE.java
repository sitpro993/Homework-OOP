package hust.soict.hedspi.lab01.test;

import hust.soict.hedspi.lab01.object.FirstDegreeEquation;

import java.util.Scanner;

public class Test_FDE {
    public static void main(String[] args){
        double a,b;
        System.out.println("Enter the values for the program: ");
        System.out.print("a =  ");
        a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        b = new  Scanner(System.in).nextDouble();
        FirstDegreeEquation eq= new FirstDegreeEquation(a,b);
        System.out.println(eq.resolve(a,b));
    }
}
