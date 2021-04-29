package com.kodilla.hibernate.manytomany.facade;

public class CompanyException extends Exception{
    public static String ERR_NOT_EXIST = "There is no company by this name";

    public CompanyException(String message) {
        super(message);
    }
}
