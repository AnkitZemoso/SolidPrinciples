package com.ankit.SolidDemo;

public class SolidWithoutL {
    /*
    L-Liskov substitution principle
     */

    class Rectangle {
        private double height;
        private double width;
        public void setHeight(double h) { height = h; }
        public void setWidth(double w) { width = w; }
        public double calculateArea(double height,double width){
            return height*width;
        }

    }
    class Square extends Rectangle {
        public void setHeight(double h) {
            super.setHeight(h);
            super.setWidth(h);
        }
        public void setWidth(double h) {
            super.setHeight(h);
            super.setWidth(h);
        }
    }

    // It will create ambiguity here and square cannot substitute for rectangle.

}
