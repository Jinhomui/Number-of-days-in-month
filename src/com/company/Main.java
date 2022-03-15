package com.company;

public class Main {

    public static void main(String[] args) {
        isLeapYear(0);
        System.out.println(getDaysInMonth(1, 0));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(3, 2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
            return true;
        } else {
            System.out.println("Not a Leap Year");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid parameter(s)");
            return -1;
        }
        if (isLeapYear(year) && month ==2) {
            System.out.println("Year " + year + " is leap year");
            return 29;
        }
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 28;
                default:
                    return 30;
            }
     }
}
