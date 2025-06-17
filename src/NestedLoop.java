import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;
        System.out.print("Enter the No Of Rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the No Of Columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the Symbol You Wanna Print: ");
        symbol = scanner.next().charAt(0);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
