import java.util.Scanner;
public class Shopping_Cart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter the Product Name to Buy: ");
        item = scanner.nextLine();
        System.out.print("Enter the quantity Of Product You Wanna Buy: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the Price Of The Product: ");
        price = scanner.nextDouble();

        total = price*quantity;
        System.out.println("You Have Ordered "+quantity+ " " +item+"/s");
        System.out.println("Your Total Bill Amount is "+total);
    }
}
