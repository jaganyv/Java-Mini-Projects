import java.util.Scanner;

public class AraaySearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int[] number = {1,9,0,3,5,6,2};
       String[] fruits = {"apple","orange","banana"};
       String target;
        System.out.println("Enter an fruit to search for: ");
       target = scanner.nextLine();
       boolean isFound = false;
       for(int i=0;i< fruits.length;i++){
           if(fruits[i].equals(target)){
               System.out.println("Element Found at index: "+i);
               isFound = true;
           }
           if(!isFound){
               System.out.println("No element found");
           }
       }
    }
}
