package org.example.employeeController;
import lombok.RequiredArgsConstructor;
import org.example.dto.Employee;
import org.example.entity.EmployeeEntity;
import org.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;
    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }
    @GetMapping("/get-all")
    public List<EmployeeEntity> getAll(){
        return service.getAll();
    }
}
