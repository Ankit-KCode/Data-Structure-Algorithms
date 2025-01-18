package employee;
import company.Company;

public class Employee extends Company{
    public void display(){
        System.out.println("Accessing Protected Variable and Method.");
        showCompanyName();
    }
}