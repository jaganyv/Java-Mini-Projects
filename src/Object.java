public class Object {
    public static void main(String[] args){
        Student student = new Student();
        Student student1 = new Student();
        student.studentId("Jagan Yadav M",20,7.77);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        student1.studentId("Kabilesh",19,8.88);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
    }
}
