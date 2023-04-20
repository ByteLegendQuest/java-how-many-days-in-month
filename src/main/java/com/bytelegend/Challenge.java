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
        int i = 0;
        boolean flag = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (flag) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    i = 31;
                    break;
                case 4, 6, 9, 11:
                    i = 30;
                    break;
                case 2:
                    i = 29;
                    break;
            }
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    i = 31;
                    break;
                case 4, 6, 9, 11:
                    i = 30;
                    break;
                case 2:
                    i = 28;
                    break;
            }
        }
            return i;
    }
}
