package hust.soict.hedspi.lab02.object;

import java.util.Scanner;

public class Array_Assignment {
    public static void main(String[] args){

        System.out.print("The number of elements in the array: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n ; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        sortASC(a);
        show(a);

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("Average value of array elements: " + sum / n);

    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr) {
        System.out.print("The array is sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
