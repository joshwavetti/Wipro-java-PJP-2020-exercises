import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class EmployeeTest {
    Employee e = new Employee();
    ArrayList<String> employees = new ArrayList<>();
    {
        employees.add("John");
        employees.add("Jack");
        employees.add("Raju");
    }

    @Test
    public void testFindName() {
        assertEquals("Result", "FOUND", e.findName(employees, "Raju"));
    }

}
