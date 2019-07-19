package com.company;

public class Rectangle {
    public int length;
    public int width;

    public Rectangle() {
    }


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void countArea() {
        System.out.println("Area is:"+length*width);
    }
    public void countPerimeter() {
        System.out.println("Perimeter is:"+ 2*(length+width));
    }
}

