package exceptionHandling;

public class ArrayException_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  int arr[]=new int[5];
        	  arr[8]=4;   //chances for occuring error
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
        	  System.out.println("Exception Handled");
        	  System.out.println(e);
          }
	}

}
