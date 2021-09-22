package com.ankit.SolidDemo;

public class SolidWithoutI {

     /*
    I-Interface Segregation principle
     */

    public interface Vehicle {
        public void drive();
        public void stop();
        public void refuel();
        public void openDoors();
    }
    public class Bike implements SolidPrinciples.Vehicle {

        // Can be implemented
        public void drive() {}
        public void stop() {}
        public void refuel() {}

        // Can not be implemented
        public void openDoors() {}
    }

    // so basically we can create another interface with the specified property and
    // allow only specified classes to implement it.
}
