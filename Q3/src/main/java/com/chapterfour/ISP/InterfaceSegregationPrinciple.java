package com.chapterfour.ISP;

/**
 * Created by Rosie on 2016/10/22.
 */
public class InterfaceSegregationPrinciple {
    /*I apply the Interface Segregation Principle by splitting
    the IWorker interface into 2 different interfaces, so that the new robot class
    is not forced to implement the "eat" method and add more methods proper for a robot.
    * */

    interface IWorker extends IFeedable, IWorkable {
    }

    interface IWorkable {
        public void work();
    }

    interface IFeedable{
        public void eat();
    }

    class Worker implements IWorkable, IFeedable{
        public void work() {
            // ....working
        }

        public void eat() {
            //.... eating in launch break
        }
    }

    class Robot implements IWorkable{
        public void work() {
            // ....working
        }
    }

    class Manager {
        IWorkable worker;

        public void setWorker(IWorkable w) {
            worker=w;
        }

        public void manage() {
            worker.work();
        }
    }
}
