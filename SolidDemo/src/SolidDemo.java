public class SolidPrinciples {

    /*
        S-Single responsibility
    */

    class Book{
        public void addBookToDB(){

        }
        public void printBookDetails(){

        }

    }

    //This voilates single responsibility principle as it has two methods two responsibility

    // We can make a new class to transfer the printing function

    class BookPrinter{
        public void printUserDetails(){

        }
    }

    /*
    O-Open Closed Principle
     */

    class Player{
        private int hp;
        private int strength;
    }
    //suppose we want to add a wizard class in our game do we need to change Player class?
    //No it will voilate the open-closed principle,we can create an wizard class which extend player class

    class Wizard extends Player{
        private int mp;
    }

    /*
    L-Liskov substition principle
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

    //we can avoid it by using abstraction

    interface Shape{
        void calculateArea();
    }
    class Rectangle implements Shape{
        public double calculateArea(double height,double width){
            return height*width;
        }
    }

    /*
    I-Interface Segregation principle
     */

    public interface Vehicle {
        public void drive();
        public void stop();
        public void refuel();
        public void openDoors();
    }
    public class Bike implements Vehicle {

        // Can be implemented
        public void drive() {}
        public void stop() {}
        public void refuel() {}

        // Can not be implemented
        public void openDoors() {}
    }

    // so basically we can create another interface with the specified property and
    // allow only specified classes to implement it.

    public interface Vehicle {
        public void drive();
        public void stop();
        public void refuel();

    }

    public interface DoorsFeature{
        public void openDoors();
    }

    /*
    D-Dependency Inversion Principle
     */

    public class Car {
        private Engine engine;
        public Car(Engine e) {
            engine = e;
        }
        public void start() {
            engine.start();
        }
    }
    public class Engine {
        public void start() {}
    }

    // So here the car class is dependent on the concrete implementation of engine class.
    // What is the engine is diesel or petrol

    // We can provide an abstraction for Engine class to implement

    public interface EngineInterface {
        public void start();
    }

    public class Car {
        private EngineInterface engine;
        public Car(EngineInterface e) {
            engine = e;
        }
        public void start() {
            engine.start();
        }
    }
    public class PetrolEngine implements EngineInterface {
        public void start() {}
    }
    public class DieselEngine implements EngineInterface {
        public void start() {}
    }





}
