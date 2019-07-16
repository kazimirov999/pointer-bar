import java.util.Objects;

/*
Написати клас Rectangle , в якому буде описано поля : довжина, ширина. Описати дані поля в конструкторі. Створити конструктор з параметрами і без параметрів. Написати методи, які будуть
розраховувати площу та периметр. В Main класі продемонструвати створення об’єктів використовуючи два конструктори. Вивести на консоль площу і периметр прямокутника. Вивід на консолі повинен
мати наступний вигляд: «Площа прямокутника = тут буде площа », «Периметр прямокутника = тут буде периметр».
*/
public class Rectangle {
    private int hight = 0;
    private int width = 0;

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public Rectangle() {
        //System.out.println("Увага! параметри не задані. Задайте параметри...");
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getHight() == rectangle.getHight() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHight(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "hight=" + hight +
                ", width=" + width +
                '}';
    }

    /*
    public void perimeter(int hight, int width) {
        int p = (hight * width);
    };

    public void square(int hight, int width) {
        int s = ((hight * 2) + (width * 2));
    };*/
}
