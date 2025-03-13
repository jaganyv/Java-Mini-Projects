import java.util.*;
public class WeightConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int option;
        System.out.println("Weight Conversion Program");
        System.out.println("1.Conversion From Lbs to Kgs");
        System.out.println("2.Conversion From Kgs to Lbs");
        System.out.println("Choose an Option: ");
        option = scanner.nextInt();
        if(option==1){
            System.out.println("Enter the value for Converting Lbs to Kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight* 0.453592;
            System.out.println("Your Weight in Kgs is: "+newWeight);
        } else if (option==2) {
            System.out.println("Enter the value for Converting Kgs to Lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight*2.28462;
            System.out.println("Your Weight in Lbs is: "+newWeight);
        }else{
            System.out.println("Enter an Valid Option");
        }
        scanner.close();

    }
}
