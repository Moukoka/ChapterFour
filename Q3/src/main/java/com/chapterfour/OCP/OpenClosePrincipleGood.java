package com.chapterfour.OCP;

/**
 * Created by Rosie on 2016/10/22.
 */
public class OpenClosePrincipleGood {
    /*I use draw() method in GraphicEditor for drawing objects,
       while moving the implementation in the abstract shape objects.
       GraphicEditor will not be changed when a new shape is added.
     */
    class GraphicEditor{
        public void drawShape(Shape s){
            s.draw();
        }
    }

     abstract class Shape{
        abstract void draw();
    }
    class Rectangle extends Shape{
        public void draw(){
            /*some code*/
        }

    }
}
