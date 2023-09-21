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

        public void setX (int X) {
        this.x=X;
        }

    public double getY() {
        return y;
    }

    public void setY(int Y) {
        this.y = Y;
    }

    public double distance () {
       return  Math.sqrt(Math.pow(x-0,2) + Math.pow(y-0,2));
    }
    public double distance (int a, int b) {
        return  Math.sqrt(Math.pow(x-a,2) + Math.pow(y-b,2));
    }

    public double distance (Point p) {
        return  Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
    }

}
