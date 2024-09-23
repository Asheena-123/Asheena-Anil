package test;

public class Hierarcial_Inheritance3 extends Hierarcial_Inheritance1 {
	public void display1()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarcial_Inheritance3 obj=new Hierarcial_Inheritance3();
		//obj.show();
		obj.display();
		obj.display1();
		
		Hierarcial_Inheritance2 obj1=new Hierarcial_Inheritance2();
		obj1.show();
		obj1.display();
		}

}
