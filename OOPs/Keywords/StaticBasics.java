public class StaticBasics{
    public static void main(String args[]){
        student s1 = new student();
        s1.Schoolname = "Technology Institute";
        System.out.println(s1.Schoolname);
        s1.setName("Alex");
        s1.getName();

        student s2 = new student();
        System.out.println(s2.Schoolname);
        s2.setName("Max R");
        s2.getName();

    }
}

class student{
    String name;
    int marks;

    // Static Variable
    static String Schoolname;

    void setName(String name){
        this.name = name;
    }

    void getName(){
        System.out.println(name);
    }
}