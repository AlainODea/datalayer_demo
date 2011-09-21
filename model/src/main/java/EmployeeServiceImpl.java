import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService
{
    public Map<String, Employee> employeesByName = new HashMap<String, Employee>();

    public Employee getByName(String name)
    {
        return employeesByName.get(name);
    }

    public Iterator<Employee> iterator()
    {
        return employeesByName.values().iterator();
    }

    public void store(Employee employee)
    {
        employeesByName.put(employee.getName(), employee);
    }
}
