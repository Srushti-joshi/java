public class Employee {
    private String name;
    private int employeeId;
    public void setEmployeeName(String name) {
        this.name = name;
        System.out.println("Employee name set to: " + name);
    }
    public void setEmployeeName(String name, int id) {
        this.name = name;
        this.employeeId = id;
        System.out.println("Employee name set to: " + name + " with ID: " + id);
    }
    public void setEmployeeSalary(double salary) {
        System.out.println("Employee salary set to: " + salary);
}
    public void setEmployeeSalary(double salary, String currency) {
        System.out.println("Employee salary set to: " + salary + " " + currency);
    }
    public void isActive(boolean active) {
        System.out.println("Employee active status: " + (active ? "Active" : "Inactive"));
    }
    public void setEmployeeGrade(char grade) {
        System.out.println("Employee grade set to: " + grade);
    }
    public void setEmployeeRating(float rating) {
        System.out.println("Employee rating set to: " + rating);
    }

    
    }

