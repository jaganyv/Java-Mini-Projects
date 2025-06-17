//import required classes and packages
import java.util.*;
public class Atm {
    //create ATMExample class to implement the ATM functionality
    public static boolean validateInputUser(int amount) {
        return amount > 0;
    }
//Main Method
    public static void main(String[] args) {
        //declare and initialize balance, withdraw, and deposit
        int balance = 10000, withdraw, deposit;
        //create scanner class object to get choice of user
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            //get choice from user
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount to be Withdrawn: ");

                    //get the withdrawl money from user
                    withdraw = scanner.nextInt();
                    if (!validateInputUser(withdraw)) {
                        System.out.println("Enter amount greater than Zero");
                        break;
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    //get deposit amount from te user
                    deposit = scanner.nextInt();
                    if(!validateInputUser(deposit))
                    {
                        System.out.println("Enter amount greater than zero");
                        break;
                    }
                    //add the deposit amount to the total balance
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println(" ");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }


        }
    }
}
