package com.javaLectureEightHW.nikolay;

public class MyArrayList {
    private Integer[] array;

    MyArrayList() {
        this.array = new Integer[10];
    }

    public int get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("you're out of array");
            return 0;
        }

    }

    public void add(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
                break;
            }
            if (i == array.length - 1) {
                Integer[] resultArray = new Integer[array.length * 2];
                copyArr(array, resultArray);
                resultArray[array.length] = value;
                array = resultArray;
            }
        }

    }

    public int length() {
        return array.length;

    }

    private void copyArr(Integer[] arrayFrom, Integer[] arrayTo) {
        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[i] = arrayFrom[i];
        }
    }

    public void remove(int value) {
        for (int i = value; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                System.out.print(array[i] + ", ");
            }else {
                break;

            }
        }
    }

    public void randomArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (Integer) (int) (Math.random() * 10);
        }
    }
}
