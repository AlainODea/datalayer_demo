public interface ModelFactory
{
    Employee createWithName(String name);
    EmployeeService createWithEmployees(Employee... employees);
}
