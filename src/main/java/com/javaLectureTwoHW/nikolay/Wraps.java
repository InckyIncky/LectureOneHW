package com.javaLectureTwoHW.nikolay;

import java.util.ArrayList;

public class Wraps {
    public static void main(String[] args) {
        Integer wrapInt = 5741;
        Double wrapDouble = 89.7;
        Character wrapChar = 'N';
        System.out.println(wrapChar + " " + wrapDouble + " " + wrapInt);
        String testString = wrapInt.toString();
        System.out.println(testString.length());
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a =i * i;
            nums.add(a);
        }
        System.out.println(nums);

        ArrayList<Double> numsDoubles = new ArrayList<>();
        for (int i = 50; i > 40; i--) {
            Double a = Math.sqrt(i);
            numsDoubles.add(a);
        }
        System.out.println(numsDoubles);
    }

}
