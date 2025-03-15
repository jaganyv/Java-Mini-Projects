import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args){
//        JAVA DICE ROLLER PROGRAM
//        DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total =0;
//        GET NO OF DICE FROM THE USER
        System.out.println("Enter the No of Dice to roll: ");
        numOfDice = scanner.nextInt();
        //        CHECK IF NO OF DICE>0
        if(numOfDice>0){
            //        ROLL AT THE DICE
            for(int i=0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                //        GET THE TOTAL
                System.out.println("You Rolled: "+roll);
                total +=roll;
            }
            System.out.println("Total: "+total);
        }else{
            System.out.println("No of dice must be greater than 0");
        }

//        DISPLAY ASCII OF DICE

    }
    static void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------          
                """;
        String dice2 = """
                -------
               | ●     |
               |       |
               |      ●|
                -------
                """;
        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |      ●|
                -------
                """;
        String dice4 = """
                -------
               | ●    ●|
               |       |
               | ●    ●|
                -------
                """;
        String dice5 = """
                -------
               | ●    ●|
               |   ●   |
               | ●    ●|
                -------
                """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}
