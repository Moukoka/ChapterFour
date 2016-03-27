package com.chapterfour.DIP;

/**
 * Created by Rosie on 2016/03/26.
 */
public class Manager {
    Worker worker;

    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        worker.workTitle();
    }
}
