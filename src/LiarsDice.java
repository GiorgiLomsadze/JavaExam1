import java.util.Random;

/**
 * Created by GiorgiL on 4/13/2016.
 */
public class LiarsDice {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3,4 ,5 };
        System.out.println(checkTwoPairCategory(array));
    }

    private static  Boolean checkTwoPairCategory (int [] dice){
        int rand1 = new Random().nextInt(dice.length);
        int rand2 = new Random().nextInt(dice.length);
        int rand3 = new Random().nextInt(dice.length);
        int rand4 = new Random().nextInt(dice.length);
        int rand5 = new Random().nextInt(dice.length);
        int[] array1 = {rand1, rand2, rand3, rand4, rand5};
        int counter0=0, counter1 = 0,counter2=0, counter3 = 0,counter4=0, counter5 = 0;
        for (int i = 0; i <array1.length ; i++) {
                switch (array1[i]){
                    case 0 : counter0++; break;
                    case 1: counter1++; break;
                    case 2 : counter2++; break;
                    case 3: counter3++; break;
                    case 4 : counter4++; break;
                    case 5: counter5++; break;

                }
        }
        int[] result = {counter0, counter1, counter2, counter3,counter4,counter5};
        int counter = 0;
        for (int i = 0; i <result.length ; i++) {
            switch (result[i]){
                case 2: counter++;break;
            }
        }
        if (counter == 2)
            return true;
        else{
            return false;
        }
    }
}
