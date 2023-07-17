package jobito;

import java.util.LinkedHashMap;
import java.util.Map;

public class likedhashmap {                   // linked hash map is class that implements the map interface

	public static void main(String[] args) {       // store the element base on key and value
		
LinkedHashMap<Integer,String> Map=new LinkedHashMap<Integer,String>();
		
		Map.put(2, "aditi");                     // key are always unique
		Map.put(4, "lahu");
		Map.put(5, "balaji");                   //allow only one null key and multiple null values 
		Map.put(2, "aditi");
		Map.put(3, "banty");                    // non synchronized
		Map.put(1, "vinod");                    // maintain the insertion order 

		for (Map.Entry m:Map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
