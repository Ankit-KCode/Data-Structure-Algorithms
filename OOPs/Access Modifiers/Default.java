// package mypackage;
public class Default{
    public static void main(String arg[]){
        Car cr = new Car();
        cr.display();
    }
}

class Car{
    String name = "BMW"; //Default field

    void display(){      //Default Method
        System.out.println("Car: " + name);
    }
}