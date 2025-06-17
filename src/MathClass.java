import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//        System.out.print("Enter  the side of a: ");
//        a = scanner.nextDouble();
//        System.out.print("Enter the side of b: ");
//        b = scanner.nextDouble();
//        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//        System.out.println("The Side of C is " + c + "cm");
//        To find out circumference area and volume
        double circumference;
        double area;
        double volume;
        double radius;
        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();
        circumference = 2*Math.PI*radius;
        System.out.println("The Circumference is: "+circumference + "cm");
        area = Math.PI*Math.pow(radius,2);
        System.out.println("The Area is: "+area+"cm^2");
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("The volume is: "+volume+"cm^3");

    }
}
