package com.chapterfour.SRP;

/**
 * Created by Rosie on 2016/10/22.
 */
public class Violation {
    interface IEmail{
        public void setSender(String sender);
        public void setReceiver(String receiver);
        public void  setContent (String content);
    }

    class Email implements IEmail{
        public void setSender(String value){String sender = value;}
        public void setReceiver(String value){String receiver = value;}
        public void  setContent (String value){String content = value;}
    }
}
