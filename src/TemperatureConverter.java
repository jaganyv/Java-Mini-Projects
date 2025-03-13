import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args){
       double temp;
       double newTemp;
       String unit;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")?(temp-32)*5/9:(temp*9/5)+32);
        System.out.printf("%.1f%s°",newTemp,unit);
        scanner.close();
    }
}
