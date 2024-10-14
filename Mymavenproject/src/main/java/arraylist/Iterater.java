package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> obj=new ArrayList<String>();//syntax of list
		//add elements to list
		obj.add("karthika");
		obj.add("aswathy");
		obj.add("asheena");
		Iterator<String> it =obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
