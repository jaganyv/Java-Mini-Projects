public class Static {
    public static void main(String[] args){
       Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");

        Friend friend3 = new Friend("SquidWard");
        Friend friend4 = new Friend("SquidWard");
//        System.out.println(friend1.numOfFriends);
//        System.out.println(friend2.numOfFriends);
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
        Math.round(3.99);
    }
}
