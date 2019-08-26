package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static int countone(String binary) {
        int sum = 0;
        for (int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1')
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(countone(Integer.toBinaryString(num)));
    }
}
