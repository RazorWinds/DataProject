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

    public String getId() {
        return id;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public String getSalary() {
        return salary;
    }
    private String salary;

    public Employee(String line) {
        String[] detailArray = line.split(",");
        int index = 0;
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

    public Employee createEmployee(String line) {
        Employee employee = new Employee(line);
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id='" + id + '\''
                + ", salutation='" + salutation + '\''
                + ", firstName='" + firstName + '\''
                + ", middleInitial='" + middleInitial + '\''
                + ", lastName='" + lastName + '\''
                + ", gender='" + gender + '\''
                + ", email='" + email + '\''
                + ", dateOfBirth='" + dateOfBirth + '\''
                + ", dateOfJoining='" + dateOfJoining + '\''
                + ", salary='" + salary + '\''
                + '}';
    }
}
