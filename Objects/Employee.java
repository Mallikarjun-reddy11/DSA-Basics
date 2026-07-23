package Objects;

public class Employee {
	int empid=101;
	String empname="Arjun";
	double empsalay=25000;

static  String  empcompany="Codegnan";
public static void main(String[] args) {

	Employee e=new Employee();
	int as=25000*12;
	System.out.println("Company: "+empcompany);
	System.out.println("Employee id:"+e.empid);
	System.out.println("Employee name:"+e.empname);
	System.out.println("Employee salary:"+as);
}



}
