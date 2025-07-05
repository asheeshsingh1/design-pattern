package Structural.Proxy.Classes;

import Structural.Proxy.Interface.EmployeeDao;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.createEmployee("ADMIN", new Employee());

            Employee employee  = employeeDao.readEmployee("ADMIN", 0);
            System.out.println("This is the employee name: "+ employee.name);
            System.out.println("This is the employee name: "+ employee.age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
