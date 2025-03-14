import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempt = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Number Guessing Game");
        System.out.println("Enter Number Between 1-10");

        do{
            System.out.print("Enter an Guess: ");
            guess = scanner.nextInt();
            attempt++;
            if(guess<randomNumber){
                System.out.println("You Guess is Too Low");
            } else if (guess>randomNumber) {
                System.out.println("You Guess is Too High");
            }
            else{
                System.out.println("Yes The Correct Number is: "+randomNumber);
                System.out.println("You Have Completed in "+attempt +" attempts");
            }
        }while(guess!=randomNumber);
        scanner.close();
    }
}
