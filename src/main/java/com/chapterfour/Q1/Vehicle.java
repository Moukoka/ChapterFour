package com.chapterfour.Q1;

/**
 * Created by Rosie on 2016/03/26.
 */
public class Vehicle {
    private String colour;
    private int size, speed;

    public int getSize() {
        return size;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColour() {
        return colour;
    }

    public void setSize(int i) {
        size= i;
    }
    public void setSpeed(int j) {
        speed = j;
    }

    // default Constructor
    public Vehicle() {
        size = 0;
        speed = 0;
        colour =null;
    }
    Vehicle(int siz, int sp, String col) {
        size = siz ;
        speed = sp;
        colour = col;
    }
    public void printdetails(){
        System.out.println("Vehicle details:");
        System.out.println("Size:" + size);
        System.out.println("Speed:" + speed);
        System.out.println("Colour:" + colour);

    }
}
