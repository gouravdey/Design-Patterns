package com.gd.creational.prototype;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        state = "boosting morale";
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }
}
