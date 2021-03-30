package hedspi.aims.utils;

import java.util.*;

public class Mydate {
    private String day;
    private String month;
    private String year;
    Scanner sc = new Scanner(System.in);
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Mydate(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int day(String day){
        switch(day){
            case "first":
                return 1;
            case "second":
                return 2;
            case "third":
                return 3;
            case "fourth":
                return 4;
            case "fifth":
                return 5;
            case "sixth":
                return 6;
            case "seventh":
                return 7;
            case "eighth":
                return 8;
            case "ninth":
                return 9;
            case "tenth":
                return 10;
            case "eleventh":
                return 11;
            case "twelfth":
                return 12;
            case "thirteenth":
                return 13;
            case "fourteenth":
                return 14;
            case "fifteenth":
                return 15;
            case "sixteenth":
                return 16;
            case "seventeenth":
                return 17;
            case "eighteenth":
                return 18;
            case "nineteenth":
                return 19;
            case "twentieth":
                return 20;
            case "twenty-first":
                return 21;
            case "twenty-second":
                return 22;
            case "twenty-third":
                return 23;
            case "twenty-fourth":
                return 24;
            case "twenty-fifth":
                return 25;
            case "twenty-sixth":
                return 26;
            case "twenty-seventh":
                return 27;
            case "twenty-eighth":
                return 28;
            case "twenty-ninth":
                return 29;
            case "thirtieth":
                return 30;
            case "thirtieth-first":
                return 31;
            default:
                return 0;
        }
    }

    public int month(String month){
        switch(month){
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
            default:
                return 0;
        }
    }

    public void print(){
        System.out.println(day(day) + "-" + month(month) + "-" + year);
    }
}
