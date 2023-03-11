// Write your code here
package com.example.employee;
import com.example.employee.*;
import java.util.*;

public interface EmployeeRepository{

    ArrayList<Employee> getAllEmployee();
    Employee getEmploye(int employeeId);
    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
