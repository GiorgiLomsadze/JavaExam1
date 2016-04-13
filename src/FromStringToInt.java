import java.util.Scanner;

/**
 * Created by GiorgiL on 4/13/2016.
 */
public class FromStringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(parseInt(input));
    }
    private static int parseInt(String st){
        int number=Integer.valueOf(st);

        return number;
    }
}
