package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int passCount = 0;

    public Plane(int passCount) {
        this.passCount = passCount;
    }

    @Override
    public void fly() {

    }
}
