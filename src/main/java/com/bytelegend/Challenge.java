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
        int answer = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            	answer = 31;
            	break;
            case 2:
            	answer = (isIt(year)) ? 29 : 28;
            	break;
            case 4:
            case 6:
            case 9:
            case 11:
            	answer = 30;
            	break;
        }
        return answer;
    }
    public static boolean isIt(int n) {
        return ((n % 400) == 0) ? true : ((n % 100) == 0) ? false : ((n % 4) == 0) ? true : false;
    }
}
