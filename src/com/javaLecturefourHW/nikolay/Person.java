package com.javaLecturefourHW.nikolay;

public class Person implements Comparable<Person>, Walkable {
    private String name;
    private String surname;
    private int age;
    private int speed;
    private int walkTime;


    public Person(String name, String surname, int age, int speed, int walkTime) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.speed = speed;
        this.walkTime = walkTime;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWalkTime() {
        return walkTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWalkTime(int walkTime) {
        this.walkTime = walkTime;
    }

    @Override
    public int compareTo(Person pers) {
        int result = this.name.compareTo(pers.name);

        if (result != 0) return result;
        result = this.surname.compareTo(pers.surname);
        if (result != 0) return result;
        result = this.age - pers.age;
        return result;

    }

    @Override
    public String toString() {

        return name + ", " + surname + ", " + age;

    }

    @Override
    public int walk() {
        return this.speed * this.walkTime;
    }

    public String reachedGoal() {
        int result = MAX_WALK_DISTANCE - this.walk();
        if (result > 0) {
            return " Distance is not covered";
        } else {
            return " Distance covered";
        }

    }


}
