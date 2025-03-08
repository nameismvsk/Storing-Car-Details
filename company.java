package classattributes;
import java.util.Scanner;

public class company {

	Scanner scanner = new Scanner(System.in);
	public void fourwheel() {
		
		System.out.println("Enter the Company Name: ");
		String companyname= scanner.nextLine();
		
		System.out.println("Enter the fuel type: ");
		String brand = scanner.nextLine();
		
		System.out.println("Emter the Car model:");
		String model = scanner.next();
		
		System.out.println("Enter the Price of the Car: ");
		long price = scanner.nextLong();
		
		System.out.println("\n========Car company Details======");
		System.out.println("car compnay name: "+companyname);
		System.out.println("Car Fuel Type: "+brand);
		System.out.println("Car model type: "+model);
		System.out.println("car price: "+price);
		
	}
	
	public static void main(String args[]) {
	  company cars  = new company();
	  cars.fourwheel();
	  cars.scanner.close();
	  
	  
	}

}
