public class Client {
    public static void main(String[] args) {
        // get android developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        e1.position();

        // get web developer
        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        e2.position();
    }
}
