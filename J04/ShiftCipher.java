package comp1110.homework.J04;

import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int svalue = sc.nextInt();
        //upper 65-90 lower 97-122
        char[] tstr = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            if(tstr[i]>=65&&tstr[i]<=90){
                tstr[i] = (char) (65+(tstr[i]-65+svalue%26)%26);
            }
            else if(tstr[i]>=97&&tstr[i]<=122){
                tstr[i] = (char) (97+(tstr[i]-97+svalue%26)%26);
            }
        }
        System.out.println(new String(tstr));
    }
}
