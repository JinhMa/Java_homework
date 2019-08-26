package comp1110.homework.J12;

public class Exchange {
    public static <T> T[] swap(T[] a, int i, int j){
        if(i>a.length||i<0||j>a.length||j<0)
            return a;
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

}
