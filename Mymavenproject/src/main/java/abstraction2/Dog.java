package abstraction2;

public class Dog extends Animal {
	public void run() { // implementation of abstract keyword
		System.out.println("Sleeping");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.run();
		obj.sleep();

	}

}
