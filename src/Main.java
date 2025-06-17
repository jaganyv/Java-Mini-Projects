import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an Adjective (Description) :");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun1 (An Person name or Animal): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective2 (Ending with ing): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter an verb1 (Something in Your Mind): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective3 (Something Funny): ");
        adjective3 = scanner.nextLine();

        System.out.println("This is about "+adjective1+"And then ");
        System.out.println("Our Main Character is "+noun1+"And Our ");
        System.out.println("Aim is to "+adjective2+"We can only ");
        System.out.println("Get this "+verb1+"And then We Can easily ");
        System.out.println("Find Out the"+adjective3);
    }
}