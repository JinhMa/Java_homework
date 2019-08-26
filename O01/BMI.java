package comp1110.homework.O01;

public class BMI {
    BMI(String name, double height, double weight) {

        this.name = name;
        this.height = height;
        this.weight=weight;
    }
    private String name;
    private double height;
    private double weight;
    public double getBMI(){
        return this.weight/(this.height*this.height);
    }
    public String toString(){
        String str = this.name+" is "+this.height+"m tall and is "+this.weight+"Kg and has a BMI of "+this.getBMI()+"Kg/m^2";
        return str;
    }
}
