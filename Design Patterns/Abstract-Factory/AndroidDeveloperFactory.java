public class AndroidDeveloperFactory extends EmployeeAbstractFactory {
    
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
