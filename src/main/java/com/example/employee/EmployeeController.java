
package com.example.employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.*;

@RestController
public class EmployeeController{
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    
    @GetMapping("/employees/{employeeId}")
    public Employee getEmploye(@PathVariable int employeeId){
        return employeeService.getEmploye(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId, employee);
    }

     @DeleteMapping("/employees/{employeeId}")
    public ArrayList<Employee> deleteEmployee(@PathVariable int employeeId){
       return employeeService.deleteEmployee(employeeId);
    }

    

}


