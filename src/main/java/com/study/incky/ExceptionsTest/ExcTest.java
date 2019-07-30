package com.study.incky.ExceptionsTest;

public class ExcTest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {


            System.out.println("Before exception generation");

            ExcTest.genExc();



            for (int i = 0; i < 6; i++) {
                arr[i] = i;
                System.out.println(arr[i]);

            }
            System.out.println("this string won't be shown");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ai) {
            System.out.println("We're out of bounds");
            ai.toString();
            ai.printStackTrace();
        }
        System.out.println("After catch");

    }

    static void genExc() {
        int nums[] = new int[5];
        nums[8] = 11;

        System.out.println("This won't be printed");
    }


}
