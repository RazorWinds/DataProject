
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import org.example.EmployeeBuilder;
import org.example.EmployeeCsvReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ConversionTests {
    
    public ConversionTests() {
    }
    @BeforeAll
    public static void setUpFileHandler() {
        EmployeeCsvReader.setUpFileHandler();
    }

    @Test
    public void testValidDateOfBirthSingleDigitMonthAndDay() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.dateOfBirth("1/1/2020");
        assertThat(builder.getDateOfBirth(), is(LocalDate.of(2020, 1, 1)));
    }

    @Test
    public void testValidDateOfBirthDoubleDigitMonthAndDay() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.dateOfBirth("12/25/2020");
        assertThat(builder.getDateOfBirth(), is(LocalDate.of(2020, 12, 25)));
    }

    @Test
    public void testValidDateOfBirthWithLeadingZeros() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.dateOfBirth("01/01/2020");
        assertThat(builder.getDateOfBirth(), is(LocalDate.of(2020, 1, 1)));
    }

    @Test
    public void testInvalidDateOfBirthThrowsException() {
        EmployeeBuilder builder = new EmployeeBuilder();
        assertThrows(DateTimeParseException.class, () -> {
            builder.dateOfBirth("13/01/2020"); // invalid month
        });
    }

    @Test
    public void testInvalidDayDateOfBirthThrowsException() {
        EmployeeBuilder builder = new EmployeeBuilder();
        assertThrows(DateTimeParseException.class, () -> {
            builder.dateOfBirth("30/02/2020"); // invalid day
        });
    }

    
    @Test
    public void testInvalidDateFormatThrowsException() {
        EmployeeBuilder builder = new EmployeeBuilder();
        assertThrows(DateTimeParseException.class, () -> {
            builder.dateOfBirth("2020-01-01"); // wrong format
        });
    }
    
    //------------= SALERY STRING TO DOUBLE =------------------\\
        @Test
    public void testValidSalary() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.salary("50000.00");
        assertThat(builder.getSalary(), is(50000.00));
    }

    @Test
    public void testValidSalaryWithInteger() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.salary("75000");
        assertThat(builder.getSalary(), is(75000.0));
    }

    @Test
    public void testInvalidSalaryThrowsException() {
        EmployeeBuilder builder = new EmployeeBuilder();
        assertThrows(NumberFormatException.class, () -> {
            builder.salary("invalidSalary"); // invalid salary format
        });
    }

    @Test
    public void testSalaryWithLeadingAndTrailingSpaces() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.salary(" 60000.00 ");
        assertThat(builder.getSalary(), is(60000.00));
    }

    @Test
    public void testNegativeSalary() {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.salary("-5000.00");
        assertThat(builder.getSalary(), is(-5000.00));
    }
}
