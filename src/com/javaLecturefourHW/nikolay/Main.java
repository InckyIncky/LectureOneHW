package com.javaLecturefourHW.nikolay;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Person> listOfPersons = new ArrayList<Person>();


        Person nikifor = new Person("Nikifor", "Krotov", 33, 5,16 );
        Person afanasiy = new Person("Afanasiy", "Gradin", 49, 5, 3);
        Person luka = new Person("Luka", "Krasnov", 15, 8, 7);
        Person ippolit = new Person("Afanasiy", "Shmekhelson", 57, 1, 2);
        Person saveliy = new Person("Saveliy", "Popov", 41, 6, 10);
        Person arkadiy = new Person("Arkadiy", "Lochmann", 37, 3, 20);

        Person[] mujiki = new Person[]{nikifor, afanasiy, luka, ippolit, saveliy, arkadiy};
        for (int i = 0; i < mujiki.length; i++) {

            System.out.println(mujiki[i].getName());
        }
        System.out.println();

        Arrays.sort(mujiki);
        for (Person p : mujiki) System.out.println(p);


    }
}
