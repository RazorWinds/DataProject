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
    
}
