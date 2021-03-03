import java.util.Scanner;

public class Test_NoDpM {

public static void main(String[] args) {
    NumberOfDaysPerMonth d = new NumberOfDaysPerMonth();
    String month = null;
    int m = 0,y;

        while (true) {
            System.out.printf("Month: ");
            month = new Scanner(System.in).nextLine();
            switch (month) {
                case "1":
                case "January":
                case "Jan":
                case "Jan.":
                    m = 1;
                    break;
                case "2":
                case "February":
                case "Feb":
                case "Feb.":
                    m = 2;
                    break;
                case "3":
                case "March":
                case "Mar":
                case "Mar.":
                    m = 3;
                    break;
                case "4":
                case "April":
                case "Apr":
                case "Apr.":
                    m = 4;
                    break;
                case "5":
                case "May":
                    m = 5;
                    break;
                case "6":
                case "June":
                case "Jun":
                    m = 6;
                    break;
                case "7":
                case "July":
                case "Jul":
                    m = 7;
                    break;
                case "8":
                case "August":
                case "Aug":
                case "Aug.":
                    m = 8;
                    break;
                case "9":
                case "September":
                case "Sep":
                case "Sept.":
                    m = 9;
                    break;
                case "10":
                case "October":
                case "Oct":
                case "Oct.":
                    m = 10;
                    break;
                case "11":
                case "November":
                case "Nov":
                case "Nov.":
                    m = 11;
                    break;
                case "12":
                case "December":
                case "Dec":
                case "Dec.":
                    m = 12;
                    break;
                default:
                    System.out.println("Invalid inputs. Please enter again.");
            }
            if(d.check_month(m) == true)break;
        }
        while (true) {
            System.out.print("Year: ");
            y = new Scanner(System.in).nextInt();
            if (d.check_year(y) == true) {

                break;
            } else System.out.println("Invalid inputs. Please enter again.");
        }
        d = new NumberOfDaysPerMonth(m,y);
    d.resolve(m,y);
    }

}

