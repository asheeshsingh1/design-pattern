package Structural.Proxy.Classes;

import Structural.Proxy.Interface.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
       System.out.println("Employee has been created");
    }

    @Override
    public Employee readEmployee(String client, int employeeID) throws Exception {
        System.out.println("Here are the employee details");
        return new Employee();
    }

    @Override
    public void updateEmployee(String client, Employee employee) throws Exception {
        System.out.println("Employee details updated");
    }

    @Override
    public void deleteEmployee(String client, int employeeID) throws Exception {
       System.out.println("Employee has been deleted");
    }

    
}
