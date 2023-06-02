public class DeveloperClient {
    public static void main(String[] args) {
        // Tight coupling
        // Employee e = new AndroidDeveloper();
        Employee e = EmployeeFactory.getEmployee("Web");
        System.out.println(e.salary());
    }
}
