import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
//        ROCK PAPER SCISSORS GAME
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter Your Move (rock,paper,scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper")&&
                    !playerChoice.equals("scissors") ){
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Compuer Choice: "+computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("Its a tie!");
            } else if (playerChoice.equals("rock")&&
                    computerChoice.equals("scissors") || (playerChoice.equals("scissors") &&
                    computerChoice.equals("paper") || (playerChoice.equals("paper") &&
                    computerChoice.equals("rock"))))  {
                System.out.println("You Win!");
            } else{
                System.out.println("You Lose!");
            }
            System.out.print("Play Again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));
        System.out.println("Thank You For Playing !!!!");
    }
}
