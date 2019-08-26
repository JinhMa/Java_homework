package comp1110.homework.O04;

public class Square extends Shape {
    double length;
    public Square(double length) {
        this.length = length;
    }
    public double perimeter(){
        return 4*length;
    }
    public double area(){
        return length*length;
    }
}
