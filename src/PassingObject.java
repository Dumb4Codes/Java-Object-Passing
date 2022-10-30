
public class PassingObject {

	public static void main(String[] args) {
		
		Car car = new Car("BMW");
		Garage garage = new Garage();

		garage.park(car);
	}

}
