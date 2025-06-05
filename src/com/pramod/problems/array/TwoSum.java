package com.pramod.problems.array;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static final int sum = 16;
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 5, 15};

        int[] indexes = twoSum(numbers, sum);

        System.out.println("Indexes of array value where sum is " + sum + " is: "+ Arrays.toString(indexes));
    }

    private static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }
}
