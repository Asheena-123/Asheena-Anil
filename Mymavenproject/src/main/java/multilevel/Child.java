package multilevel;

public class Child extends Parent{
	public void height()
	{
		System.out.println("Tall");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.height();
		obj.hair();
		obj.nose();
		
	}

}
