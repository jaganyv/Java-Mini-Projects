public class MethodOverload {
    public static void main(String[] args){
        System.out.println(average(1,2,3,4,5,6,7));
    }
    static double average(double...numbers){
        double sum = 0;
        for(double number:numbers){
            sum+=number;
        }
        return sum/ numbers.length;
    }
}
