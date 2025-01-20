public class Constructors{
    public static void main (String [] args){
        student std = new student("Alex", 201);
        student std1 = new student("Max");
        student std2 = new student(123);
        student std3 = new student();
        
        System.out.println(std1.name +" " + std2.Rollno);
        System.out.println(std.name + " " + std.Rollno);
    }
}

class student{
    String name;
    int Rollno;

    student(String name){  // Parameterise Constructor
        this.name = name;
    }

    student(int Rollno){  // Parameterise Constructor
        this.Rollno = Rollno;
    }

    student(String name, int Rollno){ // Parameterise Constructor
        this.name = name;
        this.Rollno = Rollno;
    }

    student(){ // Non Parameterise Constructor
        System.out.println("This is Constructor call.");
    }


}