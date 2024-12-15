package com.nsp.controller;

import com.nsp.model.Employees;
import com.nsp.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {
    @Autowired
    private  EmployeeService employeeService;

    @PostMapping("/signUp")
    final ResponseEntity<?> signUp(@RequestBody Employees employee){
         Employees emp = employeeService.signUp(employee);
         //log.info("getting employee details : {}",emp.getEmpName());
         return ResponseEntity.ok(emp);
    }
    @GetMapping("/signin")
    private ResponseEntity<String> signIn(@PathVariable String email,@PathVariable String pass){
        employeeService.signIn(email,pass);
        return ResponseEntity.ok("Employee Sign In Successfully");
    }
}
