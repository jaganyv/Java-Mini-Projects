import java.util.Scanner;

public class SwitchSt {
    public static void main(String[] args){


       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter An Day: ");
        String day = scanner.nextLine();

       switch(day){
           case "Monday" -> System.out.println("Its WeekDay 😒");
           case "Tuesday" -> System.out.println("Its WeekDay 😒");
           case "Wednesday" -> System.out.println("Its WeekDay 😒");
           case "Saturday" -> System.out.println("Its WeekEnd 😊");
           case "Sunday" -> System.out.println("Its WeekEnd");
           default -> System.out.println("Its Not a Day");
       }
    }
}
