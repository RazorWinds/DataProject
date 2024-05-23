package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeeCsvReader {  
    private static final String filePath = "src/main/resources/test_employees.csv";
    
    public static ArrayList<String> readFileLines() {

        ArrayList<String> arr = new ArrayList<>();

        try (
                BufferedReader reader = Files.newBufferedReader(Paths.get(filePath));) {
            String line;
            while ((line = reader.readLine()) != null) {
                arr.add(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return arr;
    }

    public static Employee createEmployee(String line) {
        String[] info  = line.split(",");
        
        EmployeeBuilder builder = new EmployeeBuilder();
        return builder
                .empId(info[0])
                .namePrefix(info[1])
                .firstName(info[2])
                .middleInitial(info[3])
                .lastName(info[4])
                .gender(info[5])
                .email(info[6])
                .dateOfBirth(info[7])
                .dateOfJoining(info[8])
                .salary(info[9])
                .build();
    }

    public static boolean isLineValid(String line){
        String regexPattern = "[0-9]{6},[A-Z]{1}[a-z]+.,[A-Za-z]+,[A-Z]{1},[A-Za-z]+,[A-Z]{1},[a-zA-Z._-]+@[a-zA-Z]+.[a-zA-Z.]+,[0-9]+\\/[0-9]+\\/[0-9]+,[0-9]+\\/[0-9]+\\/[0-9]+,[0-9.]+";
        return line.matches(regexPattern);
    }

    public static ArrayList<Employee> readEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        
        for (String line : readFileLines()){
            if (isLineValid(line)) {
                employees.add(createEmployee(line));
            }
            //else
        }
        
        return employees;
    }

}
