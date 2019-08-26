package comp1110.homework.J07;

import java.util.Scanner;

public class Menu {
    public static int findRange(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        return max - min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int getSecondHighest(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]<array[j+1]){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = sc.nextInt();
        System.out.println("Please enter:\n1 to find range of the scores\n2 to find the maximum score\n3 to find the second highest score");
        switch (opt) {
            case 1:
                System.out.println(findRange(data));
                break;
            case 2:
                System.out.println(getMax(data));
                break;
            case 3:
                if(data.length<2)
                    System.out.println("Invalid Option Selected");
                System.out.println(getSecondHighest(data));
                break;
            default:
                System.out.println("Invalid Option Selected");

        }
    }
}
