public class EmployeeView implements View
{
    private final Employee employee;

    public EmployeeView(Employee employee)
    {
        this.employee = employee;
    }

    public void show()
    {
        System.out.println("Employee: " + employee.getName());
    }
}
