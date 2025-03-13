import java.util.*;
public class Calculator {
    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double result =0 ;
        boolean validOperation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an Operator (+,-,/,*,^) : ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter an Second Number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("Cannot Divide By Zero!");
                    validOperation = false;
                }else{
                    System.out.println(result = num1/num2);
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator");
            validOperation = false;

                if(validOperation){
                    System.out.println(result);
                }
            }
        }
      scanner.close();
    }
}
