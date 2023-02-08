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
    public static int howManyDaysInMonth(int year, int month) {
        int x = 0;
        switch (month) {
            case 1:x = 31;break;
            case 2:x = (year % 4 ==0 && year % 100 !=0) || (year % 400 ==0) ? 29 : 28;break;
            case 3:x = 31;break;
            case 4:x = 30;break;
            case 5:x = 31;break;
            case 6:x = 30;break;
            case 7:x = 31;break;
            case 8:x = 31;break;
            case 9:x = 30;break;
            case 10:x = 31;break;
            case 11:x = 30;break;
            case 12:x = 31;break;
        }
        return x;
    }
}
