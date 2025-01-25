public class Abstraction{
    public static void main(String args[]){
        kart kt = new kart();
        kt.ui();
        kt.feature();

        Payment pay = new Payment();
        pay.ui();
        pay.feature();
    }
}

// Super Class - Abstract Class
abstract class Application{
    
    // Constructor
    Application(){
        System.out.println("User Profile.");
    }

    void ui(){
        System.out.println("UI: Clean and Professional.");
    }
    // Abstract Method
    abstract void feature();

}

class Payment extends Application{
    void feature(){
        System.out.println("Payment Method: Creadit Card");
    }
}

class kart extends Application{
    void feature(){
        System.out.println("Kart is empty.");
    }
}