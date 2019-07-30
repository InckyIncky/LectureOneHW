package com.javaLectureFiveHW.nikolay;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            test(new StringBuffer(""));
            test(new StringBuilder(""));
        }catch (java.io.IOException iom) {
            System.out.println(iom.getMessage());
        }
    }

    private static void test(Appendable obj) throws java.io.IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }

        long after = System.currentTimeMillis();

        System.out.println(obj.getClass().getSimpleName() + "; " + (after - before) + "ms.");

        List<String> stringList = new LinkedList<String>();


    }
}
