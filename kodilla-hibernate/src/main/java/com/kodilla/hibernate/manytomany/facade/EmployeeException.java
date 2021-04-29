package com.kodilla.hibernate.manytomany.facade;

public class EmployeeException extends Exception{
    public static String ERR_NOT_EXIST = "There is no employee by this name";

    public EmployeeException(String message) {
        super(message);
    }
}
