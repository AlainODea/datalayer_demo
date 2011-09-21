public class Main
{
    public static void main(String[] args)
    {
        ModelFactory employeeFactory = new ModelFactoryImpl();
        ViewFactory viewFactory = new ViewFactoryImpl();
        Application application = new Application(employeeFactory, viewFactory);
        application.show();
    }
}
