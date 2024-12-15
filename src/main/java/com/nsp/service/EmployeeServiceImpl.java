package com.nsp.service;

import com.nsp.model.Employees;
import com.nsp.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;
    @Override
    public Employees signUp(Employees employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean signIn(String empEmail, String password) {
        boolean flag= false;
        Employees employee= employeeRepository.findByEmpEmailIdAndEmpPassword(empEmail,password);
        String email=employee.getEmpMail();
        String pass=employee    .getPassword();

        if (employee!=null && email.equals(empEmail) && pass.equals(password)){
            flag=true;
        }
        return flag;
    }
}
