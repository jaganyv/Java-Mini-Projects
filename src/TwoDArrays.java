public class TwoDArrays {
    public static void main(String[] args){
    String[] fruits = {"apple","orange","banana"};
    String[] vegetables = {"potato","carrot","onion"};
    String[] foodss = {"chicken","pork","beef","fish"};

    String[][] groceries = {fruits,vegetables,foodss};

    for(String[] foods : groceries){
        for(String food : foods){
            System.out.print(food + " ");
        }
        System.out.println();
    }

    }
}
