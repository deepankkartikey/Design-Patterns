public class EmployeeFactory {

    // create employee
    public static Employee getEmployee(EmployeeAbstractFactory empFactory){
        return empFactory.createEmployee(); 
    }
    
}
