package Objects;

public class Main1 {
	 public static void main(String[] args) {

	        Employeerecord emp = new Employeerecord(
	                101,
	                "Sarayu",
	                "Software",
	                50000,
	                "sarayupotharaju@gmail.com",
	                "9876543210");

	        System.out.println("Employee ID : " + emp.empId());
	        System.out.println("Employee Name : " + emp.empName());
	        System.out.println("Department : " + emp.department());
	        System.out.println("Salary : " + emp.salary());
	        System.out.println("Email : " + emp.email());
	        System.out.println("Phone Number : " + emp.phoneNumber());
	    }
	}

