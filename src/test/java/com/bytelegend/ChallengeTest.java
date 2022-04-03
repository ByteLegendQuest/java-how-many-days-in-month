package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysOfLeapYear = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < days.length; i++) {
            Assertions.assertEquals(days[i], Challenge.howManyDaysInMonth(1900, i + 1));
            Assertions.assertEquals(days[i], Challenge.howManyDaysInMonth(1999, i + 1));
            Assertions.assertEquals(days[i], Challenge.howManyDaysInMonth(2021, i + 1));
            Assertions.assertEquals(daysOfLeapYear[i], Challenge.howManyDaysInMonth(2000, i + 1));
            Assertions.assertEquals(daysOfLeapYear[i], Challenge.howManyDaysInMonth(2020, i + 1));
        }
    }
}
