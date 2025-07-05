package Structural.Proxy.Classes;

import Structural.Proxy.Interface.EmployeeDao;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;

    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.createEmployee(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee readEmployee(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoObj.readEmployee(client, employeeID);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void updateEmployee(String client, Employee employee) throws Exception {
         if(client.equals("ADMIN")){
            employeeDaoObj.updateEmployee(client, employee);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void deleteEmployee(String client, int employeeID) throws Exception {
        if(client.equals("ADMIN")){
            employeeDaoObj.deleteEmployee(client, employeeID);
        }
        throw new Exception("Access Denied");
    }
    
}
