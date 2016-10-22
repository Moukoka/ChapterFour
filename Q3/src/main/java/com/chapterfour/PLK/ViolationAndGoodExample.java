package com.chapterfour.PLK;



/**
 * Created by Rosie on 2016/10/22.
 */
public class ViolationAndGoodExample {
    class LawofDelimiterDemo{

        /*This method shows two violations of law of delimiter or principle of least knowledge*/
        void process(Order o){
            //This method invocation is fine coz o is an argument of process
            //Message msg = o.getMessage();

            //This method call is a violation,as we are using msg,which we got from orders
            //We should ask order to normalize message,
            //this following code should be "o.normalizeMessage();"

           // msg.normalize();

            //This is also a violation,instead using temporary variable it uses method chain
           // o.getMessage().normalize();
        }
    }


}
