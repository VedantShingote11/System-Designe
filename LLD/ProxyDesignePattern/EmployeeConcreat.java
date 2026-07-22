package ProxyDesignePattern;

public class EmployeeConcreat implements Employee{
    
    @Override
    public void createEmployee(String name){
        System.out.println("New Employee created : "+name);
    }

    @Override
    public int getEmployee(int id){
        System.out.println("Employee fetched from db having id : "+id);
        return id;
    }

    @Override
    public int removeEmployee(int id){
        System.out.println("Employee deleted from db having id = "+id);
        return id;
    }
}
