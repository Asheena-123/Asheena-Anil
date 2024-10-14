package exceptionHandling;

public class NumberFormat_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String str="Hello";
        	int num=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
        	System.out.print("Exception Handled");
        	System.out.print(e);
        }
	}

}
