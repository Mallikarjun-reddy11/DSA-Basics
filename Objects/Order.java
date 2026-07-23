package Objects;
import java.util.Scanner;
public class Order {
	public static void main(String[] args) {
		while(true) {
		System.out.println("1. Veg biryani:  170");
		System.out.println("2. Pizza      :  290");
		System.out.println("3. chickendum :  340");
		System.out.println("4. burger     :  440");
		System.out.println("5. Exit ");

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice:");
	int choice=sc.nextInt();
	switch(choice) {
	case 1-> System.out.println("Veg biryani ordered");
	case 2-> System.out.println("Pizza is ordered");
	case 3-> System.out.println("chicken dum biryani orderd");
	case 4-> System.out.println("burger ordered");
	case 5-> System.out.println("Exit ");
	default-> System.out.println("not valid");
	}
}
}}
