package day26_statics.circleTask;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(3.6);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(Circle.pi);
        System.out.println(Circle.pi);
    }
}
