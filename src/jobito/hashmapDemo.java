package jobito;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
                                               // hash map is a class that implement the map interface 
public class hashmapDemo {                          // hash map stores the element base on key and value 

	public static void main(String[] args) {       //keys are always unique
		
		HashMap<Integer,String> map=new HashMap<Integer, String>();  
		
		map.put(1,"balaji");
		map.put(1,"lahu");                        //allow one null key and multipal null value
		map.put(2,"lahu");                        // dose not maintain any insertion order
		map.put(3,"shrinivas");                   // non synchronized
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
