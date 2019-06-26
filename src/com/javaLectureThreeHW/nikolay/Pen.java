package com.javaLectureThreeHW.nikolay;

import java.util.ArrayList;
import java.util.Objects;

public class Pen {
    private String colour;
    private double width;
    private String owner;
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
    public String getOwner() { return this.owner; }

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

}
