package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeBuilder {

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

    public EmployeeBuilder empId(String empID) {
        this.empId = empID;
        return this;
    }

    public EmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    public EmployeeBuilder middleInitial(String middleInitial) {
        this.middleInitial = middleInitial.charAt(0);
        return this;
    }

    public EmployeeBuilder gender(String gender) {
        this.gender = gender.charAt(0);
        return this;
    }

    public EmployeeBuilder email(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder dateOfBirth(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
        return this;
    }

    public EmployeeBuilder dateOfJoining(String dateOfJoining) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        this.dateOfJoining = LocalDate.parse(dateOfJoining, formatter);
        return this;
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

    public EmployeeBuilder salary(String salary) {
        this.salary = Double.parseDouble(salary);
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }
}
