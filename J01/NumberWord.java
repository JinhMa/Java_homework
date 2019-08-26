package comp1110.homework.J01;
import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int integer = scanner.nextInt();
        System.out.println(integer+", "+string);
    }
}
