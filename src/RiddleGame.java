import java.util.Scanner;
public class RiddleGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] riddles = {
                "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
                "The more you take, the more you leave behind. What am I?",
                "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?"
        };

        String[] answers = {
                "echo",
                "Footsteps",
                "fire"
        };

        String[] hints = {
                "Hint: This thing is known for its ability to reflect sound.",
                "Hint: Think about what you leave behind when you walk.",
                "Hint: It produces heat and light."
        };

        int numRiddles = riddles.length;

        while(true){
            int randomIndex = (int) (Math.random()*numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            System.out.println("Riddle: "+selectedRiddle);

            String userAnswer = scanner.nextLine();

            if(userAnswer.equalsIgnoreCase(correctAnswer)){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("Wrong! would you like a hint? (Yes/No)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("yes")) {
                    System.out.println(hint);
                }
            }

            System.out.println("Continue Playing? (Yes/No)");
            String playAgain = scanner.nextLine().toLowerCase();
            if(!playAgain.equals("yes")){
                break;
            }
        }
        System.out.println("Your Final Score: "+score);
        System.out.println("Thanks For Playing!");
    }
}
