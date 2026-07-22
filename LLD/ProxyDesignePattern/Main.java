package ProxyDesignePattern;

public class Main {
    public static void main(String[] args) {

        EmployeeProxy client = new EmployeeProxy("user" , new EmployeeConcreat());
        client.createEmployee("Joe");

        EmployeeProxy admin = new EmployeeProxy("admin" , new EmployeeConcreat());
        admin.createEmployee("Joe");

    }
}
