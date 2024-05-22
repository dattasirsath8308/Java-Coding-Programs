import javax.lang.model.element.Element;

interface Employee
{
    int salary();

    String name();
}


class WebDeveloper implements Employee
{
    @Override
    public int salary() {
        System.out.println("This Webdeveloper Salary !!");
        return 30000;
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
         System.out.println("My Name Web-Developer");
         return "Web Developer";

    }
}



class BackendDeveloper implements Employee
{
    @Override
    public int salary() {
        System.out.println("This Backend Developer Salary !!");
        return 65000;
    }

    @Override
    public String name() {
        System.out.println("My Name Backend-Developer");
        return "Backend Developer";         
    }
}


abstract class AbstractEmployeeFactory
{
    public abstract Employee createEmployee();

}


class WebDeveloperFactory  extends AbstractEmployeeFactory
{   
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}

class BackendDeveloperFactory  extends AbstractEmployeeFactory
{   
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}


class EmployeeFactory 
{

    public static Employee getEmployee(AbstractEmployeeFactory abstractFactory)
    {
        return abstractFactory.createEmployee();

        // if(empType.trim().equalsIgnoreCase("Web Developer"))
        // {
        //     return new WebDeveloper(); 
        // } else if(empType.trim().equalsIgnoreCase("Backend Developer"))
        // {
        //     return new BackendDeveloper();
        // }else
        // {
        //     return null;
        // }
    }
}


public class AbstractFactory {
    
    public static void main(String[] args) {
        

        Employee employee1 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        employee1.name();
        // int salary1 =  employee1.salary();
        // System.out.println("Salary is : "+salary1);

        
        Employee employee2 = EmployeeFactory.getEmployee(new BackendDeveloperFactory());
        employee2.name();

    }
}
