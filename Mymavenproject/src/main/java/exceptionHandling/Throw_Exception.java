package exceptionHandling;

public class Throw_Exception {
	public static void display(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible");
		
		}
		else {
			
			System.out.print("Person is Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw_Exception obj=new Throw_Exception();
		obj.display(25);
	}

}
