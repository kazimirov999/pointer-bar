package pointer.rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,6);
        Rectangle rectangle2 = new Rectangle(4);

        print(rectangle1);
        print(rectangle2);
    }

    public static void print(Rectangle rectangle) {
        System.out.println("Площа прямокутника = " + rectangle.square());
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
    }
}
