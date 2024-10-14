package abstraction2;

public class Car extends Vehicle {
	public void milage() {
		System.out.println(8);
	}
	//non abstract method is not provided implementation
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Car();
		obj.milage();
		obj.speed();

	}

}
