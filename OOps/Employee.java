package OOps;

class Student {
	String name;
	void Std(String name) {
		name = "ABC";
		System.out.println(name);
	}
	void m1() {
		System.out.println("m1 method");
	}
}
public class Employee extends Student {
	String name = "brr";
	void Emp(String name) {
this.name ="Arr";
		System.out.println(name);
		System.out.println(this.name);
	}
	void m2() {
		this.m1();
		System.out.println("M2 method");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		//Student s = new Student();
		//s.Std("");
		//e.Emp(null);/*
		e.m2();
		e.Std(null);
		e.Emp(null);
	}
}
