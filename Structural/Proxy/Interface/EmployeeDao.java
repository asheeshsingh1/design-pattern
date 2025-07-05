package Structural.Proxy.Interface;

import Structural.Proxy.Classes.Employee;

public interface EmployeeDao {
    public void createEmployee(String client,Employee employee) throws Exception;

    public Employee readEmployee(String client,int employeeID) throws Exception;

    public void updateEmployee(String client,Employee employee) throws Exception;

    public void deleteEmployee(String client,int employeeID) throws Exception;
}
