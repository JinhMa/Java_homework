package comp1110.homework.J07;

public class Blocks {
    public static int[] flatten(int[] array) {
        if(array.length==0)
            return array;
        int sum =0;
        for(int a : array){
            sum+=a;
        }
        int ave =  sum/array.length;
        int d = sum-ave*array.length;
        for(int i = 0;i<array.length;i++){
            array[i]=ave;
        }
        for(int i= 0;i<d;i++){
            if(d%2==1&&array.length%2==0)
                array[(array.length)/2-(d)/2+i-1]++;
            else
                array[(array.length)/2-(d)/2+i]++;
        }
        return array;
    }
}
