package com.chapterfour.DIP;

/**
 * Created by Rosie on 2016/03/26.
 */
public class Violation {
    public void workTitle() {
       System.out.print("Accountant");

    }

    class Manager {

        Violation violate;



        public void setViolation(Violation w) {
            violate = w;
        }

        public void manage() {
            violate.workTitle();
        }
    }

}
