package Boolean;

public class boolean_New {
	
	public static boolean display(int a)
	{
		System.out.println(" Condition is : ");
		if(a>=10 && a<100)
		{
			//System.out.println();
			return false;
		}
		else
		{
			//System.out.println();
			return true;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean_New obj=new boolean_New();
		System.out.println(display(78));
		//obj.display(22);
		
	}

}
