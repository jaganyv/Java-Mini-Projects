import java.util.Arrays;
public class Searcharray {
    public static void main(String[] args){
        String[] cars = {"Volvo","BMW","Benz"};
        cars[0] = "Ford";
        String result = cars[0];
        int numOfCars = cars.length;
        System.out.println(numOfCars);
//        Loop Through Arrays
        for(int i=0;i<cars.length;i++){
            System.out.print(cars[i]+" ");
        }
//        Enhanced Array
        for(String car:cars){
            System.out.println(car);
        }
        Arrays.sort(cars);
        Arrays.fill(cars,"Benz");
    }
}
