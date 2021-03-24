package com.codecool.farm.animal;

public abstract class Animal {
    protected int size;

    public Animal() {
        this.size = 0;
    }

    public abstract void feed();

    public abstract String getType();

    public int getSize() {
        return size;
    }
}
