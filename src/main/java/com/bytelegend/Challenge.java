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
        boolean isLeapYear = 0 == year % 100 ? (0 == year % 400 ? true : false) : (0 == year % 4 ? true : false);
        int[] arr1 = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] arr2 = {-1,31,29,31,30,31,30,31,31,30,31,30,31};
        return isLeapYear ? arr2[month] : arr1[month];
    }
}
