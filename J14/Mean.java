package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        List<Double>dlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double a = scanner.nextDouble();
            dlist.add(a);
        }
        int count = 0;
        double sum = 0;
        for(Double d:dlist){
            sum+=d;
            count ++;
        }
        System.out.println(sum/(double) count);
    }
}
