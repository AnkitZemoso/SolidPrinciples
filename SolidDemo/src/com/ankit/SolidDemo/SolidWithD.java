package com.ankit.SolidDemo;

public class SolidWithD {
    // We can provide an abstraction for Engine class to implement

    public interface EngineInterface {
        public void start();
    }

    public class Car {
        private SolidPrinciples.EngineInterface engine;
        public Car(SolidPrinciples.EngineInterface e) {
            engine = e;
        }
        public void start() {
            engine.start();
        }
    }
    public class PetrolEngine implements SolidPrinciples.EngineInterface {
        public void start() {}
    }
    public class DieselEngine implements SolidPrinciples.EngineInterface {
        public void start() {}
    }
}
