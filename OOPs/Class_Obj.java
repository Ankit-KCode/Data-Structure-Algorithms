public class Class_Obj{
    public static void main(String args[]){
        //Class Car Object
        Car c = new Car();

        c.SetName("BMW");
        c.giveRating(8);
        System.out.println(c.name + " " + c.rating);
        c.SetName("Farari");
        c.giveRating(9);
        System.out.println(c.name + " " + c.rating);

        //Class Mobile Object
        Mobile m = new Mobile();

        m.SetName("IPhone 15");
        m.SetPrice(80000);
        System.out.println(m.name + "- Rs." + m.price);
        m.SetName("Samsung S25");
        m.SetPrice(100000);
        System.out.println(m.name + "- Rs." + m.price);

    }
}

class Car{
    String name;
    int rating;

    void SetName(String NewName){
        name = NewName;
    }
    void giveRating(int newRating){
        rating = newRating;
    }
}

class Mobile{
    String name;
    int price;

    void SetName(String NewName){
        name = NewName;
    }
    void SetPrice(int NewPrice){
        price = NewPrice;
    }
}

