package com.ankit.SolidDemo;

public class SolidWithO {
    //No it will voilate the open-closed principle,we can create an wizard class which extend player class

    class Player{
        private int health;
        private int strength;
    }

    class Wizard extends Player {
        private int magic;
    }

}
