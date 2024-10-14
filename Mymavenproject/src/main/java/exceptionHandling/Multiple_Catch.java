package exceptionHandling;

public class Multiple_Catch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=10/5;
}

catch(NumberFormatException e)
{
	System.out.println("Handled");
	System.out.println(e);
	}
catch(ArithmeticException e)
{
	System.out.println("Exception");
	System.out.println(e);
	}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Handling");
	}
finally {
	System.out.print("Welcome All");
}


	}

}
