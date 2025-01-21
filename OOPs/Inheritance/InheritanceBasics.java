public class InheritanceBasics{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.info();
        emp.type();
        emp.salary = 10000000;
        System.out.println("Salary: " + emp.salary);
        emp.culture();
        emp.location();
    }
}
// This Inheritance is also called Single Level Inheritance.
// Base Class or Super Class
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
class Employee extends Company{
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