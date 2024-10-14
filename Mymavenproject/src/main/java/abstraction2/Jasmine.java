package abstraction2;

public class Jasmine extends Rose {
	public void smell() {
		System.out.println("Colour is White");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Flower obj=new Jasmine();//to get data from jasmine cls
		obj.smell();*/
		Flower obj=new Rose();//get deatils from cls rose--> to get details of rose only
		obj.smell();

	}

}
