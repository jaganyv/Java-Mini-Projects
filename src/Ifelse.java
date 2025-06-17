import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String nameIs = scanner.nextLine();
        System.out.print("Enter Your Age: ");
        int ageIs = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Are You a Student (true/false) : ");
        boolean student = scanner.nextBoolean();

        if(nameIs.isEmpty()){
            System.out.println("You are not entered your name 😡");
        }else{
            System.out.println("Hello " + nameIs + "!");
        }

        if(ageIs>=65){
            System.out.println("You are An Senior citizen");
        } else if (ageIs>=18) {
            System.out.println("Your Are an Adult");
        } else if (ageIs<=18) {
            System.out.println("You are an Minor");
        } else if (ageIs==0) {
            System.out.println("You are an Babby");
        } else{
            System.out.println("You are not entered Your age🤣");
        }

        if(student){
            System.out.println("You are an Student");
        }else{
            System.out.println("You are not an Student🤦‍♂️");
        }
        scanner.close();
    }
}
