import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Vehicle type: \n");
		String type = input.nextLine();
		
		System.out.println("Enter No of wheels: \n");
		int wheels = input.nextInt();
		
		System.out.println("Enter no of passengers: \n");
		int passenger = input.nextInt();
		
		System.out.println(type+ " has Gas?: \n");
		boolean gas = input.nextBoolean();
		
		VehicleFactory factory = new VehicleFactory();
		
		System.out.println(factory.getVehicle(type,wheels,passenger,gas).toString());

	}

}
