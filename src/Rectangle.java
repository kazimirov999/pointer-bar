public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        this.length = 5;
        this.width = 5;
    }

    int  square(){
        return length * width;
    }

    int perimeter(){
        return (length + width) * 2;
    }
    void announce(){
        System.out.println("Площа прямокутника = " + square() + "\nПериметр прямокутника = " + perimeter());
    }
}