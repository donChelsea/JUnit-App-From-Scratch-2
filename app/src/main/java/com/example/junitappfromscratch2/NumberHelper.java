package com.example.junitappfromscratch2;

import android.support.annotation.IntRange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberHelper {
    private static NumberHelper ourInstance;

    public NumberHelper() {}

    public NumberHelper getInstance() {
        if (ourInstance == null) {
            ourInstance = new NumberHelper();
        }
        return ourInstance;
    }

    public String oddOrEven(int input) {
        if (input % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public boolean divisibleBy5(int input) {
        return input % 5 == 0;
    }


    public int[] multiplesOfN(int baseNumber, @IntRange(from = 0) int range) {
        if (range < 0) {
            throw new IllegalArgumentException("Range cannot be less than 0");
        }
        int[] multiples = new int[range];
        for (int i = 0; i < range; i++) {
            multiples[i] = baseNumber * (i + 1);
        }
        return multiples;
    }

    public int stringToArray(String number) {
        if (number == null || number.equals("")) {
            throw new IllegalArgumentException("String must contain number value");
        }
        return Integer.parseInt(number);
    }

    public int arraySum(int[] input) {
        int sum = 0;
        for (int num: input) {
            sum = sum + num;
        }
        return sum;
    }

    public int largestNumber(int[] input) {
        List<int[]> nums = new ArrayList<>(Arrays.asList(input));

        int largest = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > largest) {
                largest = input[i];
            }
        }
        return largest;
    }

    public int[] numberSort(int[] input) {
        Arrays.sort(input);
        return input;
    }
}
