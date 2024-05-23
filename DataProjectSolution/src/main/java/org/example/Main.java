package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = EmployeeCsvReader.readEmployees();
        EmployeeSerialiser.outputJson(employees);
        EmployeeSerialiser.outputXml(employees);
        
    }
}