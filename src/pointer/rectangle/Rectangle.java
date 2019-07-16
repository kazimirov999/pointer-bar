package pointer.rectangle;

public class Rectangle {
    private int width;
    private int length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(int a) {
        this(a, a);
    }

    public Rectangle() {
        this(1);
    }

    int square() {
        return width*length;
    }

    int perimeter() {
        return (width + length) << 1; // or p =*2;
    }
}
