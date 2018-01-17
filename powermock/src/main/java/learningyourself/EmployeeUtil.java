package learningyourself;

import java.util.ArrayList;
import java.util.List;

import learningyourself.Employee;

import learningyourself.EmployeeService;

public class EmployeeUtil {

    private EmployeeService empService;

    public EmployeeUtil(EmployeeService empService) {
        this.empService = empService;
    }

    /**
     * Return all employee names in upper case.
     *
     * @param employees
     * @return
     */
    public List<String> getAllEmployeeFirstNamesInUpperCase(List<Employee> employees) {
        List<String> empNamesInLowerCase = empService.getEmployeeFirstNames(employees);
        List<String> result = new ArrayList<>(empNamesInLowerCase.size());

        for (String name : empNamesInLowerCase) {
            if (name == null) {
                continue;
            }

            result.add(name.toUpperCase());
        }

        return result;
    }

}