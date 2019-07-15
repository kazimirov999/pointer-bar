package pointer.rectangle;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(int a) {
        this(a, a);
    }

    public Rectangle() {
        this(1);
    }

    public int square() {
        return width*length;
    }

    public int perimeter() {
        int p = (width + length) << 1; // or p =*2;
        return p;
    }
}
