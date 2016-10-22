package com.chapterfour.SRP;

/**
 * Created by Rosie on 2016/10/22.
 */
public class SingleResponsibilityGood {
    /*I now create the Content class to split responsibilities, so that each class has
      one responsibility. If we add a new protocol, it will cause changes only in the Email class.
      If a new type of content is added changes will be done in the Content class.
     */
    interface IEmail{
        public void setSender(String sender);
        public void setReceiver(String receiver);
        public void  setContent (Content content);
    }

    interface Content{

        public String getAsString(); //used for serialization
    }

    class Email implements IEmail{
        public void setSender(String value){String sender = value;}
        public void setReceiver(String value){String receiver = value;}
        public void  setContent (Content value){Content content = value;}
    }
}
