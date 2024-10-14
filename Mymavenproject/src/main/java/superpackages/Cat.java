// super keyword --> instance variable
package superpackages;

public class Cat extends Animal {
	String name="Sheematti";
	public void show()
	{
		System.out.println(name);
		System.out.println(super.name);//refer immediate parent class name 
	}
	public static void main(String args[])
	{
		Cat obj=new Cat();
		obj.show();
	}

	
}
