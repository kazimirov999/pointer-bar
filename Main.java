package com.rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 8);
        print(rectangle);
    }

    public static void print(Rectangle rectangle) {
        System.out.println("Площа прямокутника = " + rectangle.square());
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
    }
}
