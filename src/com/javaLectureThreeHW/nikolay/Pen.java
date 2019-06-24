package com.javaLectureThreeHW.nikolay;

import java.util.ArrayList;
import java.util.Objects;

public class Pen {
    String colour;
    double width;
    String owner;
    public Pen(String colour, double width, String owner) {
        this.colour = colour;
        this.width = width;
        this.owner = owner;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return this.colour;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return this.width;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getOwner() {
        return this.owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return Double.compare(pen.width, width) == 0 &&
                Objects.equals(colour, pen.colour) &&
                Objects.equals(owner, pen.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, width, owner);
    }

    @Override
    public String toString(){
        return "Pen colour is " + colour + ", width is " + width + ", owner is " + owner;
    }

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
