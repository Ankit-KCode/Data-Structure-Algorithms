public class Constructors{
    public static void main (String [] args){
        student std = new student("Alex", 201);
        
        System.out.println(std.name +" " + std.Rollno);
    }
}

class student{
    String name;
    int Rollno;

    student(String n, int R){ // Constructor
        name = n;
        Rollno = R;
    }

    // student(){ //Constructor
    //     System.out.println("This is Constructor call.");
    // }


}