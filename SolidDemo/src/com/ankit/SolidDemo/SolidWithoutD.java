package com.ankit.SolidDemo;

public class SolidWithoutD {
    /*
    D-Dependency Inversion Principle
     */

    public class Car {
        private SolidPrinciples.Engine engine;
        public Car(SolidPrinciples.Engine e) {
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
}
