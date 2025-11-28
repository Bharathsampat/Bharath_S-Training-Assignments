package multipleof5;


class EmployeeDetails {
	int employee_ID=11099;
	String name="Bharath";
	float salary=56000.34f;
	
	void displayEmployeeDetails()
	{
		System.out.println("Employee ID: "+employee_ID +"Name: " + name +"Salary : "+ salary );
	}

}

public class classprogrambasic {

	public static void main(String[] args) {
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		System.out.println(employeeDetails.name);
		employeeDetails.displayEmployeeDetails();
		
		// TODO Auto-generated method stub

	}

}
