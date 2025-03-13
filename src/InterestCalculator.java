import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.print("Enter the Principle Amount: ");
        principle = scanner.nextDouble();
        System.out.print("Enter the Rate Of Interest in (%) : ");
        rate = scanner.nextDouble();
        System.out.print("Enter The # of times per year Compounded: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the # of Years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + (rate /100)/ timesCompounded,timesCompounded*years);
        System.out.printf("%.2f",amount);
        scanner.close();


    }
}
