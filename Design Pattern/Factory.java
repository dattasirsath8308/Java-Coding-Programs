import javax.lang.model.element.Element;

interface Employee
{
    int salary();
}


class WebDeveloper implements Employee
{
    @Override
    public int salary() {
        System.out.println("This Webdeveloper Salary !!");
        return 30000;
    }
}



class BackendDeveloper implements Employee
{
    @Override
    public int salary() {
        System.out.println("This Backend Developer Salary !!");
        return 65000;
    }
}


class EmployeeFactory
{

    public static Employee getEmployee(String empType)
    {

        if(empType.trim().equalsIgnoreCase("Web Developer"))
        {
            return new WebDeveloper(); 
        } else if(empType.trim().equalsIgnoreCase("Backend Developer"))
        {
            return new BackendDeveloper();
        }else
        {
            return null;
        }
    }
}


public class Factory {
    
    public static void main(String[] args) {
        

        Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
        int salary1 =  employee1.salary();
        System.out.println("Salary is : "+salary1);


        Employee employee2 = EmployeeFactory.getEmployee("Backend Developer");
        int salary2 =  employee2.salary();
        System.out.println("Salary is : "+salary2);


    }
}
