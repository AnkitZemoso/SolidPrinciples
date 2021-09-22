package com.ankit.SolidDemo;

public class SolidWithL {
    //we can avoid it by using abstraction

    interface Shape{
        double calculateArea(double a,double b);
    }
    class Rectangle implements Shape {
        private double height;
        private double width;
        public void setHeight(double h) { height = h; }
        public void setWidth(double w) { width = w; }
        public double calculateArea(double height,double width){
            return height*width;
        }
    }
}
