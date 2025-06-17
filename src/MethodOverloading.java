public class MethodOverloading {
    public static void main(String[] args){
        String result = add("Jagan");
        System.out.println(result);
        String getName = add("Jagan","Male");
        System.out.println(getName);
        String getAge = add("Jagan","Male",23);
        System.out.println(getAge);
    }
    static String add(String name){
        return name + " Bye";
    }
    static String add(String name,String gender){
        return name + "Hello" + gender;
    }
    static String add(String name,String gender,int age){
        return name + "Hello" + gender;
    }
}
