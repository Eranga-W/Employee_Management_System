package org.example.employeeController;
import org.example.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {
    List<Employee> employeeList = new ArrayList<>();

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeList.add(employee);

    }
    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return employeeList;
    }
}
