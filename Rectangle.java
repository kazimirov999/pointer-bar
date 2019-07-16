public class Rectangle {
    private int hight;
    private int width;

    public Rectangle(){

    }

    public Rectangle(int y, int x){
        this.hight=y;
        this.width=x;
    }

    public void findPerimeter(){
        System.out.println("Периметр прямоугольника == "+(2*(hight+width)));
    }

    public void findSquare(){
        System.out.println("Площадь прямоугольника == "+(hight*width));
    }


    public int getHight() {
        return hight;
    }

    public void setHight(int y) {
        this.hight = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int x) {
        this.width = x;
    }
}
