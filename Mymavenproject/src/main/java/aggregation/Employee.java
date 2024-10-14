package aggregation;

public class Employee {
	int id;   //instance variable
	String name;
	Address address; // ref obj of cls Address as instance variable
	Employee(int id,String name,Address address)  // local method
	{
		this.id=id; //both variables should be same
		this.name=name;
		this.address=address; // this is provide if parameter of local and instance variable are same
	}
	//default instance method
	public void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address address1 = new Address("Kollam","Kerala","India");
        Employee obj= new Employee(01,"Arathi",address1);
        obj.display();
	}

}
