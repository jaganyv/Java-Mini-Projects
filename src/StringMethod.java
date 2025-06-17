import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String email;
        String userName;
        String domain;
        System.out.print("Enter Your Email Address:");
        email = scanner.nextLine();
        userName = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);
        System.out.println("Your New UserName is: " +userName);
        System.out.println("Your Domain is:"+domain);
    }
}
