public class GettersSetters{
    public static void main(String args[]){
        //Class Car Object
        Car c = new Car();

        c.SetName("BMW");
        c.setRating(8);
        System.out.println(c.getName() + " - " + c.getRating());
        
        c.SetName("Farari");
        c.setRating(9);
        System.out.println(c.getName() + " - " + c.getRating());

    }
}

class Car{
    private String name;
    private int rating;

    void SetName(String NewName){
        this.name = NewName;
    }
    String getName(){
        return this.name;
    }
    int getRating(){
        return this.rating;
    }

    void setRating(int newRating){
        this.rating = newRating;
    }
}