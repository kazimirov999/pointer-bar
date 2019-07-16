public class RectangleExecute {
    public static void main(String[] args) {
        int perimeter = 0;
        int square = 0;

        Rectangle rectangle = new Rectangle(6, 8);
        Rectangle rectangle1 = new Rectangle();


        System.out.println("Задані параметри довжини -> " + rectangle.getWidth() + " а ширини " + rectangle.getHight());
        if (rectangle.getWidth() <= 0 || rectangle.getHight() <= 0) {
            System.out.println("Увага! параметри не задані (не може бути 0). Задайте параметри...\n");
        } else {
            perimeter = rectangle.getHight() * rectangle.getWidth();
            square = rectangle.getHight() * 2 + rectangle.getWidth() * 2;

            System.out.println("Периметр прямокутника = тут буде периметр " + perimeter);
            System.out.println("Площа прямокутника = тут буде площа " + square);
        }

        System.out.println("------------------------------------------------------------");

        System.out.println("Задані параметри довжини -> " + rectangle1.getWidth() + " а ширини " + rectangle1.getHight());
        if (rectangle1.getWidth() <= 0 || rectangle1.getHight() <= 0) {
            System.out.println("Увага! параметри не задані (не може бути 0). Задайте параметри...\n");
        } else {
            perimeter = rectangle1.getHight() * rectangle1.getWidth();
            square = rectangle1.getHight() * 2 + rectangle1.getWidth() * 2;

            System.out.println("Периметр прямокутника = тут буде периметр " + perimeter);
            System.out.println("Площа прямокутника = тут буде площа " + square);
        }
    }
}
