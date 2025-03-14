import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
//        Java Banking Program
//        Declare Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;
        while(isRunning){
//        Display Menu
            System.out.println("*******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************");

//        Get And Process users
            System.out.print("Enter Your Choice (1-4): ");
            choice  = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("*********************************");
        System.out.println("   Thank You! Have a nice day!😊 ");
        System.out.println("*********************************");
        scanner.close();
    }
    //        ShowBalance()
    static void showBalance(double balance){
        System.out.println("*******************");
        System.out.printf("₹%.2f\n",balance);
    }
    //        Deposit
    static double deposit(){
        double amount;
        System.out.print("Enter an Amount To Be Deposited: ");

        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount Can't be Negative");
            return 0;
        }else{
            return amount ;
        }

    }
    //        Withdraw
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter an Amount To Be Withdrawn: ");
        amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount<0) {
            System.out.println("Amount Can't Be Negative");
            return 0;
        }else{
            return amount;
        }

    }
}
