import org.example.Employee;
import org.example.EmployeeCsvReader;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.example.EmployeeCsvReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class Tests {
    
    public Tests() {
    }
    
    
    
    @Test
    @DisplayName("Details in customer objects should be correct")
    void test1(){
        String expectedID = "198429";
        String actualID = EmployeeCsvReader.readEmployees("src/main/resources/employees.csv").get(1).getId();
        
        assertThat(actualID, is(expectedID));
    }
    
    @Test
    @DisplayName("Does array have correct length")
    void test2(){
        int acutalAmount = EmployeeCsvReader.readEmployees("src/main/resources/employees.csv").size();
        
        assertThat(acutalAmount, is(10001));
    }
    
    
    @Test
    @DisplayName("Details in customer objects should be correct")
    void test3(){
        String expectedID = "133641";
        String actualID = EmployeeCsvReader.readEmployees("src/main/resources/employees.csv").get(10000).getId();
        
        assertThat(actualID, is(expectedID));
    }
        @Test
    public void testReadEmployees_CorrectNumberOfEmployees() throws IOException {
        // Arrange
        String fileName = "src/main/resources/test_employees.csv";
        int expectedNumberOfEmployees = 3;  // Replace with actual number of employees in your test file

        EmployeeCsvReader reader = new EmployeeCsvReader();

        // Act
        ArrayList<Employee> employees = reader.readEmployees(fileName);

        // Assert
        MatcherAssert.assertThat(employees.size(), Matchers.equalTo(expectedNumberOfEmployees));

    }

    @Test
    public void testReadEmployees_FirstEmployeeData() throws IOException {
        // Arrange
        String fileName = "src/main/resources/test_employees.csv";
        String expectedId = "198429";
        String expectedFirstName = "Serafina";
        String expectedLastName = "Bumgarner";

        EmployeeCsvReader reader = new EmployeeCsvReader();

        // Act
        ArrayList<Employee> employees = reader.readEmployees(fileName);
        Employee firstEmployee = employees.get(0);

        // Assert
        MatcherAssert.assertThat(firstEmployee.getId(), Matchers.equalTo(expectedId));
        MatcherAssert.assertThat(firstEmployee.getFirstName(), Matchers.equalTo(expectedFirstName));
        MatcherAssert.assertThat(firstEmployee.getLastName(), Matchers.equalTo(expectedLastName));

    }

    @Test
    public void testReadEmployees_LastEmployeeData() throws IOException {
        // Arrange
        String fileName = "src/main/resources/test_employees.csv";
        int numberOfEmployees = 3;  // Replace with actual number of employees in your test file
        String expectedId = "647173";
        String expectedFirstName = "Milan";
        String expectedLastName = "Krawczyk";

        EmployeeCsvReader reader = new EmployeeCsvReader();

        // Act
        ArrayList<Employee> employees = reader.readEmployees(fileName);
        Employee lastEmployee = employees.get(employees.size() - 1);

        // Assert
        MatcherAssert.assertThat(lastEmployee.getId(), Matchers.equalTo(expectedId));
        MatcherAssert.assertThat(lastEmployee.getFirstName(), Matchers.equalTo(expectedFirstName));
        MatcherAssert.assertThat(lastEmployee.getLastName(), Matchers.equalTo(expectedLastName));

    }

}
