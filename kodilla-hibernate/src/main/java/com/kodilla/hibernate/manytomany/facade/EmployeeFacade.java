package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {
    @Autowired
    EmployeeDao employeeDao;


    public List<Employee> searchEmployeeNamePart(String part) {
        return employeeDao.selectEmployeeNamePart(part);
    }
}
