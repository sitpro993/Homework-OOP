import java.util.Scanner;

public class Test_NoDpM {

    public static void main(String[] args) {
        NumberOfDaysPerMonth d = new NumberOfDaysPerMonth();
        String month = null;
        String check;
        String s1 = "Y";
        String s2 = "N";
        int m, y;

        while (true) {
            while (true) {
                System.out.printf("Month: ");
                month = new Scanner(System.in).nextLine();
                m = d.input_month(month);
                if (m > 0) break;
            }
            while (true) {
                System.out.printf("Year: ");
                y = new Scanner(System.in).nextInt();
                if (d.check_year(y) == true) {
                    break;
                } else System.out.println("Invalid inputs. Please enter again.");
            }
            d = new NumberOfDaysPerMonth(m, y);
            d.resolve(m, y);
            while (true) {
                System.out.printf("You want to continue(Y/N): ");
                check = new Scanner(System.in).nextLine();
                if(check.compareTo(s1) == 0 || check.compareTo(s2) == 0) break;
                else System.out.println("Invalid inputs----. Please enter again.");
            }
            if(check.compareTo(s1) == 0) continue;
            if (check.compareTo(s2) == 0) break;

        }
    }

}

