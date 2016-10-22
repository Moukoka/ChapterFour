package com.chapterfour.ISP;

/**
 * Created by Rosie on 2016/10/22.
 */
public class Violation {
    interface IWorker {
        public void work();
        public void eat();
    }

    class Worker implements IWorker{
        public void work() {
            // ....working
        }
        public void eat() {
            // ...... eating in launch break
        }
    }

    class Manager {
        IWorker worker;

        public void setWorker(IWorker w) {
            worker=w;
        }

        public void manage() {
            worker.work();
        }
    }
}
