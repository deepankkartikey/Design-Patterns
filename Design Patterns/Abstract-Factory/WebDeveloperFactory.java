public class WebDeveloperFactory extends EmployeeAbstractFactory {
    
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}
