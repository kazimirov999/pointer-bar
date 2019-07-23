package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        }

    public void diameter(){
        if (width < 1 || length < 1)
            System.out.println("Error. Choose a positive number");
        else
            System.out.println("The Diameter is " + (width + length)*2);
    }

    public void square(){
        if (width < 1 || length < 1)
            System.out.println("Error. Choose a positive number");
        else
            System.out.println("The Square is " + width * length);
    }
}
