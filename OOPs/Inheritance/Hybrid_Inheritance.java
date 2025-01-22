public class Hybrid_Inheritance{
    public static void main(String args[]){
        Reels1 r1 = new Reels1();
        Reels2 r2 = new Reels2();

        System.out.println("App: " + r1.App);
        r2.feature();

        r1.trending();
        System.out.println("Username: " + r1.username);
        System.out.println("Reel: " + r1.reelname);
        System.out.println("Views : " + r1.views);

        r2.trending();
        System.out.println("Username: " + r2.username);
        System.out.println("Reel: " + r2.reelname);
        System.out.println("Views : " + r2.views);
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

//extends user1
class Reels1 extends User1{
    String reelname = "Travel reel on Trending music.";
    int views = 990604000;

    void trending(){
        System.out.println("Most Popular Reel---- User1");
    }
}

//extends user2
class Reels2 extends User2{
    String reelname = "Latest Meme reel";
    int views = 12000000;

    void trending(){
        System.out.println("Most Popular Reel---- User2");
    }
}