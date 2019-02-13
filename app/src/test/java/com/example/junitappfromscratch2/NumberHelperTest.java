package com.example.junitappfromscratch2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHelperTest {
    private static NumberHelper numberHelper;

    @Before
    public void setUp() {
        numberHelper = new NumberHelper().getInstance();
    }

    @Test
    public void check_odd_or_even_with_odd_input() {
        int testNum = 3;
        String expectedResult = "Odd";

        String result = numberHelper.oddOrEven(testNum);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_odd_or_even_with_even_input() {
        int testNum = 24;
        String expectedResult = "Even";

        String result = numberHelper.oddOrEven(testNum);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void check_divisible_by_5_with_false_input() {
        int testNum = 68;

        boolean result = numberHelper.divisibleBy5(testNum);

        Assert.assertFalse(result);
    }

    @Test
    public void check_divisible_by_5_with_true_input() {
        int testNum = 65;

        boolean result = numberHelper.divisibleBy5(testNum);

        Assert.assertTrue(result);
    }

    @Test
    public void check_multiples_of_n_with_valid_input() {
        int testBase = 3;
        int testRange = 10;

        int[] expectedResult = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        int[] result = numberHelper.multiplesOfN(testBase, testRange);

        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void check_multiples_of_n_with_empty_range() {
        int testBase = 3;
        int testRange = 0;

        int[] expectedResult = {};

        int[] result = numberHelper.multiplesOfN(testBase, testRange);

        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void check_string_to_array_with_valid_input() {
        String testString = "5";
        int expected = 5;

        int result = numberHelper.stringToArray(testString);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_string_to_array_with_invalid_input() {
        String testString = "";
        IllegalArgumentException expected = new IllegalArgumentException();

        int result = numberHelper.stringToArray(testString);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_array_sum() {
        int[] testArray = new int[]{2, 2, 2};
        int expected = 6;

        int result = numberHelper.arraySum(testArray);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_largest_number() {
        int[] testArray = new int[]{2, 3, 4};
        int expected = 4;

        int result = numberHelper.largestNumber(testArray);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void check_sorted_array() {
        int[] testArray = new int[]{5, 3, 1, 2, 4};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] result = numberHelper.numberSort(testArray);

        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        numberHelper = null;
    }
}
