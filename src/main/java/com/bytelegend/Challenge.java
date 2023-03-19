package com.bytelegend;

public class Challenge {
    private static final int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] daysOfLeapYear = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
        return isLeapYear(year) ? daysOfLeapYear[month - 1] : days[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }
}
