package org.example;

import java.time.LocalDate;

public class Employee {

    private String empId;
    private String namePrefix;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private char gender;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private double salary;

    public Employee(EmployeeBuilder builder) {
        empId = builder.getEmpId();
        namePrefix = builder.getNamePrefix();
        firstName = builder.getFirstName();
        middleInitial = builder.getMiddleInitial();
        lastName = builder.getLastName();
        gender = builder.getGender();
        email = builder.getEmail();
        dateOfBirth = builder.getDateOfBirth();
        dateOfJoining = builder.getDateOfJoining();
        salary = builder.getSalary();
    }

    public String getEmpId() {
        return empId;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + empId + '\'' +
                ", salutation='" + namePrefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
