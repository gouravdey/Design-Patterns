package com.gd.creational.prototype;

public abstract class GameUnit implements Cloneable {

    private int positionX;
    private int positionY;

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    public GameUnit() {
        positionX = 0;
        positionY = 0;
    }

    public GameUnit(int x, int y) {
        positionX = x;
        positionY = y;
    }

    public void move(int distanceX, int distanceY) {
        positionX += distanceX;
        positionY += distanceY;
    }

    public String getPosition() {
        return positionX + "," + positionY;
    }

    private void initialize() {
        positionX = 0;
        positionY = 0;
        reset();
    }

    public abstract void reset();
}
