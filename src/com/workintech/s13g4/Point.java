package com.workintech.s13g4;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
        public double getX() {
            return x;
        }

        public void setX (int yeniX) {
        this.x=yeniX;
        }

    public double getY() {
        return y;
    }

    public void setY(int yeniY) {
        this.y = yeniY;
    }

    public double distance () {
        double calculation = ((xB − xA)*(xB - xA) + (yB − yA) * (yB - yA));
        return Math.sqrt(calculation);
    }

}
