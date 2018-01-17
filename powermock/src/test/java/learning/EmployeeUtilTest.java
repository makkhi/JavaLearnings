package learning;

import static org.junit.Assert.*;

import java.util.*;

import learningyourself.*;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith( PowerMockRunner.class )
@PrepareForTest(EmployeeServiceNew.class)
public class EmployeeUtilTest {

    private List<Employee> employees;
    private List<String> employeeNames;

    @Before
    public void initList() {
        Employee emp1 = new Employee(1, "Hari krishna", "Gurram", 12345, "India");
        Employee emp2 = new Employee(2, "Kiran", "Kumnoor", 234556, "Germany");
        Employee emp3 = new Employee(3, "Soumen", "Mondle", 56789, "India");
        Employee emp4 = new Employee(4, "Sravya", "Guruju", 567890, "Japan");
        Employee emp5 = new Employee(5, "Rachit", "Kumar", 123645, "India");

        employees = new ArrayList<>();
        employeeNames = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        employeeNames.add("Hari krishna");
        employeeNames.add("Kiran");
        employeeNames.add("Soumen");
        employeeNames.add("Sravya");
        employeeNames.add("Rachit");
    }

   /* @Test
    public void getAllEmployeeFirstNamesInUpperCase_listOfEmployees_ListOfEmployeeNamesinUpperCase() {
        EmployeeService employeeService = new EmployeeService();

        EmployeeUtil empUtil = new EmployeeUtil(employeeService);

        List<String> employeeFirstNames = empUtil.getAllEmployeeFirstNamesInUpperCase(employees);

        assertEquals(employeeFirstNames.size(), 5);
        assertEquals(employeeFirstNames.get(0), "Hari krishna".toUpperCase());
        assertEquals(employeeFirstNames.get(1), "Kiran".toUpperCase());
        assertEquals(employeeFirstNames.get(2), "Soumen".toUpperCase());
        assertEquals(employeeFirstNames.get(3), "Sravya".toUpperCase());
        assertEquals(employeeFirstNames.get(4), "Rachit".toUpperCase());

    }*/

    @Test
    public void getAllEmployeeFirstNamesInUpperCase_listOfEmployees_ListOfEmployeeNamesinUpperCase() {
        EmployeeService mockedEmployeeService =  PowerMockito.mock(EmployeeService.class);
        PowerMockito.when((mockedEmployeeService.getEmployeeFirstNames(employees))).thenReturn(employeeNames);

        EmployeeUtil empUtil = new EmployeeUtil(mockedEmployeeService);

        List<String> employeeFirstNames = empUtil.getAllEmployeeFirstNamesInUpperCase(employees);

        assertEquals(employeeFirstNames.size(), 5);
        assertEquals(employeeFirstNames.get(0), "Hari krishna".toUpperCase());
        assertEquals(employeeFirstNames.get(1), "Kiran".toUpperCase());
        assertEquals(employeeFirstNames.get(2), "Soumen".toUpperCase());
        assertEquals(employeeFirstNames.get(3), "Sravya".toUpperCase());
        assertEquals(employeeFirstNames.get(4), "Rachit".toUpperCase());

    }


    @Test
    public void getAllEmployeeFirstNamesInUpperCase_listOfEmployees_ListOfEmployeeNamesinUpperCase1() {
        PowerMockito.mockStatic(EmployeeServiceNew.class);
        Mockito.when(EmployeeServiceNew.getEmployeeFirstNames(employees)).thenReturn(employeeNames);

        EmployeeUtilNew empUtil = new EmployeeUtilNew();

        List<String> employeeFirstNames = empUtil.getAllEmployeeFirstNamesInUpperCase(employees);

        assertEquals(employeeFirstNames.size(), 5);
        assertEquals(employeeFirstNames.get(0), "Hari krishna".toUpperCase());
        assertEquals(employeeFirstNames.get(1), "Kiran".toUpperCase());
        assertEquals(employeeFirstNames.get(2), "Soumen".toUpperCase());
        assertEquals(employeeFirstNames.get(3), "Sravya".toUpperCase());
        assertEquals(employeeFirstNames.get(4), "Rachit".toUpperCase());

    }
}