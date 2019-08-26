package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int i) {
        if (i % 2 == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isOdd(num))
            System.out.println(num + " is odd");
        else
            System.out.println(num + " is even");
    }
}
