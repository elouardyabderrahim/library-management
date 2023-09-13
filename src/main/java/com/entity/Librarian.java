package com.entity;

public class Librarian extends User {
 private String employeeID;
    public Librarian(long userId,String employeeID,String lastName, String  firstName,String email,String password) {
    super(userId,lastName,firstName,email,password);
    this.employeeID=employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
