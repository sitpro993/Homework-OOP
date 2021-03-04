import java.util.Scanner;

public class Test_NoDpM {

public static void main(String[] args) {
    NumberOfDaysPerMonth d = new NumberOfDaysPerMonth();
    String month = null;
    int m,y;


    while (true){
        System.out.printf("Month: ");
        month = new Scanner(System.in).nextLine();
        m = d.input_month(month);
        if(m > 0) break;
    }
    while (true) {
        System.out.printf("Year: ");
        y = new Scanner(System.in).nextInt();
        if (d.check_year(y) == true) {
            break;
        } else System.out.println("Invalid inputs. Please enter again.");
    }
    d = new NumberOfDaysPerMonth(m,y);
    d.resolve(m,y);
    }

}

