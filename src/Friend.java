public class Friend {
    static int numOfFriends;
    String name;
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    static void showFriends(){
        System.out.println("You Have"+numOfFriends+"Total Freinds");
    }
}
