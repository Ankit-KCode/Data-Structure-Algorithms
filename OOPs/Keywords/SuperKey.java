public class SuperKey{
    public static void main(String args[]){
        smartphone sm = new smartphone();
        System.out.println(sm.name);
    }

}

class mobile{
    String name;

    mobile(){
        System.out.println("This is mobile");
    }
}

class smartphone extends mobile{
    
    smartphone(){
        super();
        super.name = "iPhone";
        System.out.println("This is SmartPhone.");
    }
}