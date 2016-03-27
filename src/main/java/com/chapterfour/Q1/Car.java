package com.chapterfour.Q1;

/**
 * Created by Rosie on 2016/03/26.
 */
public class Car extends Vehicle{
    private String model;

    // default Constructor
    Car() {
        super();
        model = null;
    }

    // Parameterized Constructor
    Car(int siz, int sp, String col,String mod) {
        super (siz, sp, col);
        model= mod;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String mod) {
        model = mod;
    }

    public void printdetails(){
        super.printdetails();
        System.out.println("Model:" + model);

    }

}
