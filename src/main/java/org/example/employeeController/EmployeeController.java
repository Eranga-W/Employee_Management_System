package org.example.employeeController;
import org.example.dto.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {
    List<Employee> employeeList = new ArrayList<>();

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeList.add(employee);

    }
}
