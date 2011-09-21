public class Application implements View
{
    private final ModelFactory modelFactory;
    private final ViewFactory viewFactory;

    public Application(ModelFactory modelFactory, ViewFactory viewFactory)
    {
        this.modelFactory = modelFactory;
        this.viewFactory = viewFactory;
    }

    public void show()
    {
        EmployeeService employees = modelFactory.createWithEmployees(
                modelFactory.createWithName("Alain O'Dea"),
                modelFactory.createWithName("Jason Lilly"),
                modelFactory.createWithName("Ryan Green"));
        View employeesView = viewFactory.createView(employees);
        employeesView.show();
        for (Employee employee : employees)
        {
            View employeeView = viewFactory.createView(employee);
            employeeView.show();
        }
    }
}
