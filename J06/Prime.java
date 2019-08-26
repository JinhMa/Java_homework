package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n+1;i++){
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
