package com.javaLecturefourHW.nikolay;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Person> listOfPersons = new ArrayList<Person>();


        Person nikifor = new Person("Nikifor", "Krotov", 33, 5, 16);
        Person afanasiy = new Person("Afanasiy", "Gradin", 49, 5, 3);
        Person luka = new Person("Luka", "Krasnov", 15, 8, 7);
        Person ippolit = new Person("Afanasiy", "Shmekhelson", 57, 1, 2);
        Person saveliy = new Person("Saveliy", "Popov", 41, 6, 10);
        Person arkadiy = new Person("Arkadiy", "Lochmann", 37, 4, 20);
        Person afanasiy3 = new Person("Afanasiy", "Gradin", 10, 2, 10);

        Person[] mujiki = new Person[]{nikifor, afanasiy, luka, ippolit, saveliy, arkadiy, afanasiy3};
        for (int i = 0; i < mujiki.length; i++) {

            System.out.println(mujiki[i].getName());
        }
        System.out.println();

        Arrays.sort(mujiki);
        for (Person p : mujiki) {
            System.out.println(p);
        }

        for (Person p : mujiki) {
            System.out.println(p.getName() + " " + p.getSurname() + " walked " + p.walk() + " km. " + p.reachedGoal());
        }

        System.out.println();

        Pet juchka = new Pet("Juchka", "Dog", 4, 10, 10, "Saveliy");
        Pet murka = new Pet("Murka", "Cat", 6, 8, 3, "Arkadiy");
        Pet archi = new Pet("Archi", "Dog", 10, 13, 3, "Luka");
        Pet bandit = new Pet("Bandit", "Coon", 5, 15, 24, "Afanasiy");
        Pet[] jivnost = new Pet[]{juchka, murka, archi, bandit};
        for (Pet p : jivnost)
            System.out.println(p.getName() + " " + p.getSpiecies() + " walked " + p.walk() + " km. " + p.reachedGoal());

    }
}
