public class NumberOfDaysPerMonth {
    private int m;
    private int y;

    public NumberOfDaysPerMonth() {
    }

    public NumberOfDaysPerMonth(int m, int y){
        this.m = m;
        this.y = y;
    }

//    public int getM() {
//        return this.m;
//    }
//
//    public void setM(int m) {
//        this.m = m;
//    }
//
//    public double getY() {
//        return this.y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

//    public boolean check_month(int m){
//        return 0 < m && m < 13;
//    }
    public boolean check_year(int y){
        return 1900 <= y && y <= 9999;
    }

    public int check_leap_year(int y){
        if(y % 4 == 0 && y % 100 != 0) return 1;
        else return -1;
    }

    public int input_month(String month){
        switch (month) {
            case "1":
            case "January":
            case "Jan":
            case "Jan.":
                return 1;
            case "2":
            case "February":
            case "Feb":
            case "Feb.":
                return 2;
            case "3":
            case "March":
            case "Mar":
            case "Mar.":
                return 3;
            case "4":
            case "April":
            case "Apr":
            case "Apr.":
                return 4;
            case "5":
            case "May":
                return 5;
            case "6":
            case "June":
            case "Jun":
                return 6;
            case "7":
            case "July":
            case "Jul":
                return 7;
            case "8":
            case "August":
            case "Aug":
            case "Aug.":
                return 8;
            case "9":
            case "September":
            case "Sep":
            case "Sept.":
                return 9;
            case "10":
            case "October":
            case "Oct":
            case "Oct.":
                return 10;
            case "11":
            case "November":
            case "Nov":
            case "Nov.":
                return 11;
            case "12":
            case "December":
            case "Dec":
            case "Dec.":
                return 12;
            default:
                System.out.println("Invalid inputs. Please enter again.");
                return 0;
        }
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


