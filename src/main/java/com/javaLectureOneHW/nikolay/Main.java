package com.javaLectureOneHW.nikolay;

import com.javaLectureOneHW.nikolay.Cat;
import com.javaLectureOneHW.nikolay.Dog;

public class Main {
    public static void main(String[] args) {
        Cat kubik = new Cat("Kurilsky bobtail", 4, 5.5, "Kubik", "Meow", false);
        Dog Jake = new Dog("Dachsenhund", 4, 12.5, "Jake", "Gav-Gav", false);

        System.out.println(kubik.getWeight() + " " + kubik.getName() + " " + kubik.getAge());
        kubik.setWeight(7.5);
        System.out.println(kubik.getWeight());
    }
}
