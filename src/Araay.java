import java.util.Scanner;

public class Araay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter an umber of food You want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for(int i=0;i< foods.length;i++){
            System.out.print("Enter a Foods: ");
            foods[i] = scanner.nextLine();
        }
        for(String food : foods){
            System.out.println(food);
        }

    }
}
