public class Printf {
    public static void main(String[] args){
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 158;
        boolean isTrue = true;
        int price1 = 1;
        int price2 = 23;
        int price3 = 456;
        int price4 = 7890;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your Name First Character is %c\n",firstLetter);
        System.out.printf("You are %d Years Old\n",age);
        System.out.printf("You are %.1f Inches Tall\n",height);
        System.out.printf("Employed %b\n",isTrue);

        System.out.printf("%4d\n",price1);
        System.out.printf("%4d\n",price2);
        System.out.printf("%04d\n",price3);
        System.out.printf("%-4d\n",price4);
        System.out.printf("%s and You are %d Years Old",name,age);
    }

}
