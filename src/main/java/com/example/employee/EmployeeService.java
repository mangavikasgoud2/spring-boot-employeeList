


package com.example.employee;

import com.example.employee.Employee;
import com.example.employee.EmployeeRepository;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.employee.*;

import java.util.*;



public class EmployeeService implements EmployeeRepository {

    private static HashMap<Integer, Employee> employeeList = new HashMap<>();

    public EmployeeService() {
        employeeList.put(1, new Employee(1, "John Doe", "johndoe@example.com", "Marketing"));
        employeeList.put(2, new Employee(2, "Jane Smith", "janesmith@example.com", "Human Resources"));
        employeeList.put(3, new Employee(3, "Bob Johnson", "bjohnson@example.com", "Sales"));
        employeeList.put(4, new Employee(4, "Alice Lee", "alee@example.com", "IT"));
        employeeList.put(5, new Employee(5, "Mike Brown", "mbrown@example.com", "Finance"));
        employeeList.put(6, new Employee(6, "Sara Lee", "slee@example.com", "Operations"));

    }

    // Do not modify the above code

    // Write your code here
    Integer uniqueId = 7;

    public ArrayList<Employee> getAllEmployee(){
       Collection<Employee> listArr = employeeList.values();
       ArrayList<Employee> arrList = new  ArrayList<>(listArr);
       return arrList;
    }

    public Employee getEmploye(int employeeId){
        Employee employee = employeeList.get(employeeId);
        if(employee == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return employee;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeId(uniqueId);
        employeeList.put(uniqueId,employee);
        uniqueId+=1;
        return employee;
    }

    
    public Employee updateEmployee(int employeeId, Employee employee){
        Employee toUpEmployee =  employeeList.get(employeeId);
        if(toUpEmployee == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(employee.getEmployeeName() != null){
            toUpEmployee.setEmployeeName(employee.getEmployeeName());
        }
        if(employee.getEmail() != null){
            toUpEmployee.setEmail(employee.getEmail());
        }
        if(employee.getDepartment() != null){
            toUpEmployee.setDepartment(employee.getDepartment());
        }
        return toUpEmployee;

    }
    
    
    public void deleteEmployee(int employeeId){
        Employee employee =  employeeList.get(employeeId);
        if(employee == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        else{
            employeeList.remove(employeeId);
            //getAllEmployee();
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }

        
        //
    }



    

}
