package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(howManyDaysInMonth(1999, 2));
        System.out.println(howManyDaysInMonth(2020, 2));
        System.out.println(howManyDaysInMonth(1900, 2));
        System.out.println(howManyDaysInMonth(2022, 12));
    }

    /**
     * `howManyDaysInMonth` method returns the number of days in the specified year and month.
     *
     * <p>For example, `howManyDaysInMonth(2020, 2)` returns 29.
     *
     * <p>`howManyDaysInMonth(2020, 4)` returns 30.
     *
     * <p>`howManyDaysInMonth(1900, 2)` returns 28.
     */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ? true : false;
    }
    public static int howManyDaysInMonth(int year, int month) {
        int res=0;
        switch (month){
            case 1 : res = 31; 
            break;
            case 2 : res = 28; 
            break;
            case 3 : res = 31; 
            break;
            case 4 : res = 30; 
            break;
            case 5 : res = 31; 
            break;
            case 6 : res = 30; 
            break;
            case 7 : res = 31; 
            break;
            case 8 : res = 31; 
            break;
            case 9 : res = 30; 
            break;
            case 10 : res = 31; 
            break;
            case 11 : res = 30; 
            break;
            case 12 : res = 31; 
            break;
        }
        if(isLeapYear(year) && month == 2){
            res = 29;
        }
        return res;
    }
}
