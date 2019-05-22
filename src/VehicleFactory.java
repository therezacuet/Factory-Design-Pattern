
public class VehicleFactory {
	
	public Vehicle getVehicle(String carType, int wheels, int passenger, boolean gas) {
		
		Vehicle obj = null;
		
		if(carType.toLowerCase().equals("car")) {
			obj = new Car(wheels,passenger,gas);
		}
		else if(carType.toLowerCase().equals("plane")) {
			obj = new Plane(wheels,passenger,gas);
		}
		else {
			System.out.println("we can not do that");
		}
		
		return obj;
	}

}
