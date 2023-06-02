public class EmployeeFactory {
    // get the desired employee
    public static Employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        }
        else if(type.trim().equalsIgnoreCase("Web")){
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
