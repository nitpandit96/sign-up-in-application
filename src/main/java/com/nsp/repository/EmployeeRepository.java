package com.nsp.repository;

import com.nsp.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    //custom method
    Employees findByEmpEmailIdAndEmpPassword(String empEmail, String password);
}
