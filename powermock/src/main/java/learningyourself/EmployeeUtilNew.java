package learningyourself;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtilNew {

    private EmployeeService empService;

    /**
     * Return all employee names in upper case.
     *
     * @param employees
     * @return
     */
    public List<String> getAllEmployeeFirstNamesInUpperCase(List<Employee> employees) {
        List<String> empNamesInLowerCase = EmployeeServiceNew.getEmployeeFirstNames(employees);
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