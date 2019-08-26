package comp1110.homework.J10;

public class SquareRoot {
    public static String findPreciseRoot(int n, int d){
        if (n<0)
            return String.valueOf(-1);
        double r = Math.sqrt(n);
        int ir = (int)r;
        if(ir*ir == n) {
            return String.valueOf(ir);
        }else {
            return String.format("%."+d+"f", r);
        }

    }
}
