package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeCsvReader.readEmployees();
        System.out.println(EmployeeCsvReader.faultyLines.size());
    }
}