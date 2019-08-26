package comp1110.homework.J06;

import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str2.length() == str1.length()) {
            boolean[] bl = new boolean[str2.length()];
            for(int i=0;i<str1.length();i++){
                for(int j = 0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)&&!bl[j]){
                        bl[j] = true;
                        break;
                    }
                }
            }
            for(int i=0;i<str1.length();i++)
                if(!bl[i]) {
                    System.out.println("No");
                    return;
                }
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
