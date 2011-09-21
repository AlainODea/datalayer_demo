public class ViewFactoryImpl implements ViewFactory
{
    public View createView(EmployeeService employees)
    {
        return new EmployeesView(employees);
    }

    public View createView(Employee employee)
    {
        return new EmployeeView(employee);
    }
}
