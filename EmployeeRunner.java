public class EmployeeRunner{
	public static void main(String[] args){
		 Employee emp = new Employee();
        emp.setEmployeeName("srushti");
        emp.setEmployeeName("srushti", 101);
        emp.setEmployeeSalary(50000);
        emp.setEmployeeSalary(50000, "USD");
        emp.isActive(true);
        emp.setEmployeeGrade('A');
        emp.setEmployeeRating(4.5f);

	
}
}