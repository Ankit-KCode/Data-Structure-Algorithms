public class CopyConstructor{
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "Alex";
        s1.Rollno = 123;
        s1.password = "xyz1";
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=88;

        student s2 = new student(s1);
        s2.password = "abc123";
        s1.marks[2]=98;

        System.out.println("NAME: "+ s2.name + "\nRoll no: " + s2.Rollno + "\nPassword: " + s2.password);

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class student{
    String name;
    int Rollno;
    String password;
    int marks[];

    student(student s1){
        this.name = s1.name;
        this.Rollno = s1.Rollno;
        marks = new int[3];
        this.marks = s1.marks;
    }

    student(){
        marks = new int[3];
        System.out.println("Constructor is Called!...");
    }
}