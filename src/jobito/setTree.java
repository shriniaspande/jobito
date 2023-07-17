package jobito;

import java.util.Map;
import java.util.TreeMap;

public class setTree {                      

	public static void main(String[] args) {
		
		TreeMap<Integer,String> Map=new TreeMap<Integer,String>();
		
		Map.put(1,"mango");                // store the element ascending order  
		Map.put(4,"apple");                // contains the only unique element 
		Map.put(3,"banana");               // does not allow null value 
		Map.put(2,"grave");                // non synchronized
		Map.put(5,"custurd appel");
		for(Map.Entry m:Map.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
