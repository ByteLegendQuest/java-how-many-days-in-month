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
        int a = 0;
        switch (month) {
            case 1:
                a = 31;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
                    a = 29;
                    break;
                } else {
                    a = 28;
                    break;
                }
            case 3:
                a = 31;
                break;
            case 4:
                a = 30;
                break;
            case 5:
                a = 31;
                break;
            case 6:
                a = 30;
                break;
            case 7:
                a = 31;
                break;
            case 8:
                a = 31;
                break;
            case 9:
                a = 30;
                break;
            case 10:
                a = 31;
                break;
            case 11:
                a = 30;
                break;
            case 12:
                a = 31;
                break;
        }
        return a;
    }
}
