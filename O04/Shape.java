package comp1110.homework.O04;

public abstract class Shape {
    public double perimeter(){
        return 0.0;
    }
    public double area(){
        return 0.0;
    }

    public static void main(String[] args) {
        Shape s1 = new Square(10);    // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0);   // a circle of radius 1.0 units
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }
}
