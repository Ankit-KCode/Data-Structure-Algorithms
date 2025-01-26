public class InterfaceBasics{
    public static void main(String args[]){
        up up = new up();
        up.action();

        down dn = new down();
        dn.action();
    }
}

interface gameButtons{
    void action();
}

class up implements gameButtons{
    public void action(){
        System.out.println("Jump");
    }
}

class down implements gameButtons{
    public void action(){
        System.out.println("Slip down");
    }
}

class forward implements gameButtons{
    public void action(){
        System.out.println("Fast Boost");
    }
}

class backward implements gameButtons{
    public void action(){
        System.out.println("Slow Down");
    }
}