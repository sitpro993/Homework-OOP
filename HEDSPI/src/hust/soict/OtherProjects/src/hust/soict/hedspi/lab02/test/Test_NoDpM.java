package hust.soict.hedspi.lab02.test;

import hust.soict.hedspi.lab02.object.NumberOfDaysPerMonth;

import java.util.Scanner;

public class Test_NoDpM {
    public static void main(String[] args) {
        NumberOfDaysPerMonth d = new NumberOfDaysPerMonth();
        String month;
        String check;
        int m, y;

        while (true) {
            while (true) {
                System.out.print("Month: ");
                month = new Scanner(System.in).nextLine();
                m = d.input_month(month);
                if (m > 0) break;
            }
            while (true) {
                System.out.print("Year: ");
                y = new Scanner(System.in).nextInt();
                if (d.check_year(y)) {
                    break;
                } else System.out.println("Invalid inputs. Please enter again.");
            }
            d = new NumberOfDaysPerMonth(m, y);
            d.resolve(m, y);
            while (true) {
                System.out.print("You want to continue(Y/N): ");
                check = new Scanner(System.in).nextLine();
                if(check.compareTo("Y") == 0 || check.compareTo("N") == 0) break;
                else System.out.println("Invalid inputs----. Please enter again.");
            }
            if(check.compareTo("Y") == 0) continue;
            if (check.compareTo("N") == 0) break;

        }
    }
}
