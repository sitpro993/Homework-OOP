import java.util.Scanner;

public class NumberOfDaysPerMonth {
    private int m;
    private int y;

    public NumberOfDaysPerMonth() {
    }

    public NumberOfDaysPerMonth(int m, int y){
        this.m = m;
        this.y = y;
    }

    public int getM() {
        return this.m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public double getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean check_month(int m){
        if(0 < m &&  m <13) return true;
        else return false;
    }
    public boolean check_year(int y){
        if(1900 <= y && y <= 9999 ) return true;
        else return false;
    }

    public int check_leap_year(int y){
        if(y % 4 == 0 && y % 100 != 0) return 1;
        else return -1;
    }

    public int input_month(String month){
        while (true) {
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
            if(check_month(m) == true)
                break;
            else return 0;
        }
        return  m;
    }

    public void resolve(int m, int y) {
        switch (m) {
            case 1:
                System.out.println("January has 31 days.");
                break;
            case 3:
                System.out.println("March has 31 days.");
                break;
            case 5:
                System.out.println("May has 31 days.");
                break;
            case 7:
                System.out.println("July has 31 days.");
                break;
            case 8:
                System.out.println("August has 31 days.");
                break;
            case 10:
                System.out.println("October has 31 days.");
                break;
            case 12:
                System.out.println("December has 31 days.");
                break;
            case 4:
                System.out.println("April has 30 days.");
                break;
            case 6:
                System.out.println("June has 30 days.");
                break;
            case 9:
                System.out.println("September has 30 days.");
                break;
            case 11:
                System.out.println("November has 30 days.");
                break;
            case 2:
                if(check_leap_year(y) > 0) System.out.println("February of lead year has 29 days");
                else System.out.println("February has 28 days");
                break;
        }
    }

}


