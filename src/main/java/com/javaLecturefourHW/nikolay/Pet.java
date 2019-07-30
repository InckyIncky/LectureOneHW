package com.javaLecturefourHW.nikolay;

public class Pet implements Walkable {
    String spiecies;
    String name;
    int age;
    int speed;
    int walkTime;
    String owner;

    public Pet(String spiecies, String name, int age, int speed, int walkTime, String owner) {
        this.spiecies = spiecies;
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.walkTime = walkTime;
        this.owner = owner;
    }

    public String getSpiecies() {
        return spiecies;
    }

    public void setSpiecies(String spiecies) {
        this.spiecies = spiecies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWalkTime() {
        return walkTime;
    }

    public void setWalkTime(int walkTime) {
        this.walkTime = walkTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int walk() {
        return this.getSpeed() * this.getWalkTime();

    }

    public String reachedGoal() {
        int result = MAX_WALK_DISTANCE - this.walk();
        if (result > 0) {
            return "distance is not covered";
        } else {
            return "distance covered";
        }

    }

}
