import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by GiorgiL on 4/13/2016.
 */
public class SimpleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Damamtavrebeli simboloa 0 !");
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (true){
            int y = scanner.nextInt();
            if (y == 0) {
                break;
            }
            else{
            arrayList.add(y);
            }

        }
        int counter = 1, result = 0 ;
        int i = 0;
        while(i < arrayList.size()-1){
            if ((i+1)<=arrayList.size()) {
                if (arrayList.get(i) < arrayList.get(i + 1)){
                    counter++;
                }else{
                    counter = 0;
                }
            }
            if (result < counter){
                result = counter+1;

            }

            i++;
        }
        System.out.println(result);
    }
}
