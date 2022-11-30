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


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

                return 31;

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {

                return 30;

            } else if (month == 2) {

               return 29;

            }

        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

                return 31;

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {

                return 30;

            } else if (month == 2) {

               return 28;

            }

        }

        return 0;
    }



}
