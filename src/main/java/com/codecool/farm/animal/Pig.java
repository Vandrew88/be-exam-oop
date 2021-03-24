package com.codecool.farm.animal;

public class Pig extends Animal {

    public Pig() {
        super();
    }

    @Override
    public String getType() {
        return "pig";
    }

    @Override
    public void feed() {
        size++;
    }
}
