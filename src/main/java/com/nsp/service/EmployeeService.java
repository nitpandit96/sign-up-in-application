package com.nsp.service;

import com.nsp.model.Employees;

public interface EmployeeService {
    Employees signUp(Employees employee);
    boolean signIn(String empEmail, String password);
}
