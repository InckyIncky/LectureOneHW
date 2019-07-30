package com.javaLectureOneHW.nikolay;

import com.javaLectureOneHW.nikolay.Animal;

public class Cat extends Animal {
    private String breed;
    private int age;
    private double weight;
    private String name;
    private String says;
    private boolean wild;

    public Cat(String breed, int age, double weight, String name, String says, boolean wild){
        breed = breed;
        age = age;
        weight = weight;
        name = name;
        says = says;
        wild = wild;

    }

    public void setWild (boolean wild) {
        this.wild = wild;
    }
    public boolean getWild (boolean wild) {
        return this.wild;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return this.breed;
    }
    public void setAge(int Age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setSays(String says) {
        this.says = says;
    }
    public String getSays() {
        return this.says;
    }


}
