package exceptionHandling;

public class NullPointerException_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
        	 String str=null;
        	 System.out.print(str.length());
        	 
         }
         catch(NullPointerException e)
         {
        	 System.out.print("Exception Handled");
        	 System.out.println(e);
         }
	}

}
