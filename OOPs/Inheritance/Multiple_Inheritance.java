public class Multiple_Inheritance{
    public static void main(String args[]){
        Employee2 emp2 = new Employee2();
        emp2.newinfo();
        emp2.type();
        emp2.info();
        emp2.salary();
        emp2.location();
    }
}

class Company{
    String name;
    int valuation;

    void type(){
        System.out.println("IT Company.");
    }

    void info(){
        System.out.println("We are Hiring.");
    }
}

// Sub Class 
class Employee1 extends Company{
    String EmpName;
    int salary;

    void salary(int salary){
        this.salary = salary;
    }

    void culture(){
        System.out.println("Good Culture.");
    }

    void location(){
        System.out.println("Gurugram NCR");
    }
}

// Sub-Sub Class
class Employee2 extends Employee1{

    void newinfo(){
        System.out.println("New Oppenings !");
    }

    void salary(){
        System.out.println("Salary: 15000000.");
    }
} 