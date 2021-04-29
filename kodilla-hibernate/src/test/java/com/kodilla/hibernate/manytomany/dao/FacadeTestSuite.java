package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import com.kodilla.hibernate.manytomany.facade.EmployeeFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private EmployeeFacade employeeFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    void testEmployeeByNamePart() {
        //Given
        Employee employee1 = new Employee("Mark", "Twain");
        Employee employee2 = new Employee("John", "McCain");
        Employee employee3 = new Employee("Elton", "Arwait");

        //When
        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();
        employeeDao.save(employee3);
        int employee3Id = employee3.getId();

        //Then
        assertEquals(2, employeeFacade.searchEmployeeNamePart("wai").size());

        //Clean
        try {
            employeeDao.deleteById(employee1Id);
            employeeDao.deleteById(employee2Id);
            employeeDao.deleteById(employee3Id);
        } catch (Exception e) {

        }
    }

    @Test
    public void testCompanyByPartOfTheName() {
        //Given
        Company company1 = new Company("ADIDAS");
        Company company2 = new Company("NIKE");
        Company company3 = new Company("REEBOK");

        //When
        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        //Then
        assertEquals(1, companyFacade.searchCompanyByPartOfTheName("IDA").size());

        //Clean
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            companyDao.deleteById(company3Id);
        } catch (Exception e) {

        }
    }
}
