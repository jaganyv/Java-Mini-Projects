import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What No Of food Do You Want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for(int i=0;i< foods.length;i++){
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        for(String food:foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
