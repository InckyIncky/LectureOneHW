package com.javaLectureEightHW.nikolay;

public class CollectionsRunner {

    public static void main(String[] args) {

        MyArrayList array1 = new MyArrayList();

        array1.add(4);
        array1.printArray();
        System.out.println();

        array1.randomArray();
        array1.printArray();
        System.out.println();
        array1.add(11);
        array1.printArray();

        array1.remove(7);
        System.out.println();
        array1.printArray();

    }


}
