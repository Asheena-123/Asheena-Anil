package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();//syntax of list
		//add elements to list
		obj.add("karthika");
		obj.add("aswathy");
		obj.add("asheena");
		obj.clear();//method
		System.out.print(obj);
		// Clear -> remove all items from the list
	}

}
