package pl.globallogic.sessions.s5.polymorphism;

public class ShapeProcessor {
    public static void main(String[] args) {
        Shape someRectangle = new Rectangle("red", 2, 5);
        Shape someCircle = new Circle("red", 5);

//        System.out.println("Rectangle area" + someRectangle.area());
//        System.out.println("Rectangle perimeter" + someRectangle.perimeter());
//
//        System.out.println("Circle area" + someCircle.area());
//        System.out.println("Circle perimeter" + someCircle.perimeter());

        showShapeData(someRectangle);
        System.out.println("---------------------------------");
        showShapeData(someCircle);
    }

    public static void showShapeData(Shape shape) {
        System.out.println(shape.type() + " with area = " + shape.area() + " and with perimeter = " + shape.perimeter());
    }
}
