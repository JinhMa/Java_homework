package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        char mchar = 0;
        int count = 0;
        String newdata = "";
        for (char c : data.toCharArray()) {
            if (c != mchar ) {
                if(mchar!=0 && count!=1){
                    newdata = newdata + String.valueOf(count);
                }
                count = 1;
                mchar = c;
                newdata = newdata + String.valueOf(mchar);
            }else{
                count++;
            }
        }
        if(count!=1&&count!=0){
            newdata = newdata + String.valueOf(count);
        }
        System.out.println(newdata);
    }
}
