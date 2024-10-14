//super keyword --> cls method
package superpackages;

public class Car extends vehicle {
	public void display()
	
	{
		System.out.println("BMW");	
		super.display(); // immediate parent cls
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.display();

	}

}
