public class VariableScope {
    static int x =3;

    public static void main(String[] args){
        int x =1;
        System.out.println(x);
        add();

    }
    static void add(){
        int x =2;
        System.out.println(x);
    }
}
