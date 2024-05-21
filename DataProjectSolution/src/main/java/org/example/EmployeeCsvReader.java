package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeeCsvReader {

    public ArrayList<String> readFileLines(String fileName) {
        ArrayList<String> arr = new ArrayList<>();

        try (
                BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));) {
            String line;
            while ((line = reader.readLine()) != null) {
                arr.add(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return arr;
    }

    public Employee createEmployee(String line) {
        return new Employee(line);
    }

    public ArrayList<Employee> readEmployees(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        for (String line : readFileLines(fileName)){
            employees.add(createEmployee(line));
        }
        
        return employees
    }

}
