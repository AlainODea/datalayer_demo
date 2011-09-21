public class EmployeesView implements View
{
    private final EmployeeService employees;

    public EmployeesView(EmployeeService employees)
    {
        this.employees = employees;
    }

    public void show()
    {
        System.out.println("Employees:");
        for (Employee e : employees)
        {
            System.out.println("- " + e.getName());
        }
    }
}
