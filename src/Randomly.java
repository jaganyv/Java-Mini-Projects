import java.util.Scanner;
import java.util.Random;
public class Randomly {
    public static void main(String[] args){
        Random random = new Random();
       double number;
        double number1;
        double number2;
        boolean flip;
        flip = random.nextBoolean();
       number = random.nextDouble(1,101);
        number1 = random.nextDouble(1,101);
        number2 = random.nextDouble(1,101);
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

        if(flip){
            System.out.println("HEADS");
        }else{
            System.out.println("TAILS");
        }

    }
}
