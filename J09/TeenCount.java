package comp1110.homework.J09;

public class TeenCount {
    private static boolean applyPredicate(int value, IntPredicate predicate) {
        return predicate.test(value);
    }
    public static int[] teenLess(int[] array){
        int count = 0;
        for(int x: array){
            if(applyPredicate(x,i->((i<13)||(i>19))))
                count ++;
        }
        int [] newArray = new int[count];
        count  = 0;
        for(int x: array){
            if(applyPredicate(x,i->((i<13)||(i>19)))) {
                newArray[count] = x;
                count++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

    }
    public interface IntPredicate{
        boolean test(int value);
    }
}
