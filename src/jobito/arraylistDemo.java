package jobito;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();  
		
		al.add("maroti");
		al.add("audi");
		al.add("BMW");                                  // store the only value
		al.add("tata");                                //not maintain the acceding order
		al.add("tata");                                // allow the duplicate value
		al.add("mahindra");                           // Maintain the insertion order
		al.add("mahindra");
		al.remove(3);
		al.contains(3);
//		
//		for (String str:al) {
//			System.out.println(str);
		
	//	}
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
