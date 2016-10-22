package com.chapterfour.OCP;

/**
 * Created by Rosie on 2016/10/22.
 */
//Open close principle - Violation example
public class Violation {
    class GraphicEditor{
        public void drawShape(Shape s){
            if (s.m_type==1)
                drawRectangle(s);
            else if (s.m_type==2)
                drawCircle(s);
        }
        public void drawRectangle(Shape r){/*some code*/}
        public void drawCircle(Shape r){/*some code*/}
    }
    class Shape{
        int m_type;
    }
    class Rectangle extends Shape {
        Rectangle(){super.m_type=1;}
    }
    class Circle extends Shape{
        Circle(){super.m_type=2;}
    }
}
