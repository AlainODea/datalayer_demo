public class ModelFactoryImpl implements ModelFactory
{
    public Employee createWithName(String name)
    {
        Employee employee = new EmployeeRecord();
        employee.setName(name);
        return employee;
    }

    public EmployeeService createWithEmployees(Employee... employees)
    {
        EmployeeService employeeService = new EmployeeServiceImpl();
        for (Employee employee : employees)
        {
            employeeService.store(employee);
        }
        return employeeService;
    }
}
