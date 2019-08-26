package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int len = sc.nextInt();
        if(len==1)
            System.out.println(name+" runs for "+len+" minute");
        else if(len<60)
            System.out.println(name+" runs for "+len+" minutes");
        else if(len==60)
            System.out.println(name+" runs for "+(int)(len/60)+" hour");
        else if(len<120)
            System.out.println(name+" runs for "+(int)(len/60)+" hour and "+len%60+" minutes");
        else if(len%60==0)
            System.out.println(name+" runs for "+(int)(len/60)+" hours");
        else
            System.out.println(name+" runs for "+(int)(len/60)+" hours and "+len%60+" minutes");
    }
}
