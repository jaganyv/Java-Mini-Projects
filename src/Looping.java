import java.util.Scanner;

public class Looping {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int max = 10;

        for(int i=max;i>=1;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
    }
}
