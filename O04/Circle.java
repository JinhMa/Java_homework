package comp1110.homework.O04;

public class Circle extends Shape {
    double length;
    public Circle(double length) {
        this.length = length;
    }
    public double perimeter(){
        return 2*Math.PI*length;
    }
    public double area(){
        return Math.PI*length*length;
    }

}
