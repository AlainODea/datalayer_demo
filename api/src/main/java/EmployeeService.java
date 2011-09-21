public interface EmployeeService extends Iterable<Employee>
{
    Employee getByName(String name);
    void store(Employee employee);
}
