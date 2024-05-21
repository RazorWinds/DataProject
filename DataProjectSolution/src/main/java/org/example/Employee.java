package org.example;

public class Employee {

    private String id;
    private String salutation;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String dateOfJoining;
    private String salary;

    public Employee(String line) {
        String[] detailArray = line.split(",");
        int index=0;
        id = detailArray[index++];
        salutation = detailArray[index++];
        firstName = detailArray[index++];
        middleInitial = detailArray[index++];
        lastName = detailArray[index++];
        gender = detailArray[index++];
        email = detailArray[index++];
        dateOfBirth = detailArray[index++];
        dateOfJoining = detailArray[index++];
        salary = detailArray[index];
    }

    public Employee createEmployee(String line){
        Employee employee = new Employee(line);
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salutation='" + salutation + '\'' +
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
