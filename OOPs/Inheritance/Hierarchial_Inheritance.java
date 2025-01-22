public class Hierarchial_Inheritance{
    public static void main(String args[]){
        User1 u1 = new User1();
        User2 u2 = new User2();

        
        System.out.println(u1.App);
        System.out.println(u1.totalusers);
        u1.feature();
        System.out.println("------------------");
        
        //user1
        System.out.println("Username: "+u1.username);
        System.out.println("Followers: " + u1.followers);
        u1.using();

        //user2
        System.out.println("Username: " + u2.username);
        System.out.println("Followers: " + u2.followers);
        u2.using();
    }

}

// Super or Base Class 
class Instagram{
    String App = "INSTAGRAM";
    String totalusers = "5+ Billions";

    void feature(){
        System.out.println("Post - Reels - Stories - Live");
    }
}

// Sub Class 1
class User1 extends Instagram{
    String username = "abc123";
    int followers = 120000;

    void using(){
        System.out.println("Using Reels.");
    }

}

// Sub Class 2
class User2 extends Instagram{
    String username = "xyz321";
    int followers = 5001400;

    void using(){
        System.out.println("Using Reels and Stories.");
    }
}