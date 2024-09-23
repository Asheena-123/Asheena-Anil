package exceptionHandling;

public class ArithmeticException_Program {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a=10/0;
        }
        catch(ArithmeticException e) {   //exception is a cls
        	System.out.println("Exception Handled");
        	System.out.println(e);
        	}
       
	}

}
