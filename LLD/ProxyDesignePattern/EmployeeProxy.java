package ProxyDesignePattern;

public class EmployeeProxy implements Employee{
    
    EmployeeConcreat obj;
    String type;

    public EmployeeProxy(String type , EmployeeConcreat obj){
        this.type = type;
        this.obj = obj;
    }

    @Override
    public void createEmployee(String name){
        if(type.equals("admin")){
            obj.createEmployee(name);
        }
        else{
            System.out.println("Access denied");
        }
    }

    @Override
    public int getEmployee(int id){
        if(type.equals("admin")){
            return obj.getEmployee(id);
        }
        else{
            System.out.println("Access denied");
            return -1;
        }
    }

    @Override
    public int removeEmployee(int id){
        if(type.equals("admin")){
            return obj.removeEmployee(id);
        }
        else{
            System.out.println("Access denied");
            return -1;
        }
    }
}
