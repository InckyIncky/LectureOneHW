package com.javaLectureThreeHW.nikolay;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pen parker = new Pen("colour",0.0,"noname" );
        System.out.println(parker.toString());
        parker.setColour("blue");
        parker.setWidth(0.7);
        parker.setOwner("Nikifor");
        int hCode = parker.hashCode();
        System.out.println(parker.getColour());
        System.out.println(parker.getWidth());
        System.out.println(parker.getOwner());
        System.out.println(hCode);

        Pen parker2 = new Pen("colour", 0.0,"noname");
        parker2.setColour("blue");
        parker2.setWidth(0.7);
        parker2.setOwner("Nikifor");
        int hCode2 = parker2.hashCode();
        System.out.println(hCode2);
        System.out.println(parker.equals(parker2));

        ArrayList<Pen> penArrayList = new ArrayList<Pen>();

        penArrayList.add(new Pen("black", 1.0, "Afanasiy"));
        penArrayList.add(new Pen("pink", 0.3, "Luka"));
        penArrayList.add(new Pen("green", 0.7, "Ippolit"));
        penArrayList.add(new Pen("red", 0.9, "Saveliy"));
        penArrayList.add(new Pen("yellow", 0.5, "Arkadiy"));

        for (Pen ppen : penArrayList) {
            System.out.println(ppen);
        }


    }
}
