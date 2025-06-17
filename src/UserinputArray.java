
import java.util.Scanner;

public class UserinputArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;
        System.out.println("What no of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for(int i=0;i<foods.length;i++){
            System.out.println("Enter a Food: ");
            foods[i] = scanner.nextLine();
        }
        for(String food:foods){
            System.out.println(food);
        }
    }
}
