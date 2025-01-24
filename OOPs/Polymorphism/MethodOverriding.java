public class MethodOverriding{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.name();
    }
}

//Method Overriding - Runtime
class Company{
    void name(){
        System.out.println("Tech Inc.");
    }
}

class Employee extends Company{
    //Override & it will always call sub class method over base class.
    void name(){
        System.out.println("Employee name.");
    }
}