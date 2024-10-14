package hashset;

import java.util.HashSet;
import java.util.Set;


public class HashSet_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<String>obj=new HashSet <String> (); // if store in set
        /*obj.add("karthika");
 		obj.add("aswathy");
 		obj.add("asheena");
 		System.out.println(obj);*/
         
         //1. contains()
        obj.add("karthika");
  		obj.add("aswathy");
  		obj.add("asheena");
  		//System.out.println(obj.contains("Aleena"));
  		//System.out.println(obj.contains("Alan"));
  		
  		//2. remove()
         //obj.remove("Asheena");
         //System.out.println(obj);
  		
  		//3. clear()
  		//obj.clear();
  		//System.out.println(obj);
  		
  		//4. size()

  		System.out.println(obj.size());

	}

}
