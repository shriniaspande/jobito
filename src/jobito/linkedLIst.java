package jobito;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedLIst {

	public static void main(String[] args) {
		
	//	LinkedList<String>ll=new LinkedList<String>();      // <we are using in that the wrapper class  Integer,Float,Double ext>
		
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("ajay");
		ll.add("vijay");
		ll.add("ram");
		ll.add("laxman");                                         // we store the only value
		ll.add("Balaji");                                         // maintain the insertion order
		ll.add("shree");                                         //not maintain the accenting order
		ll.add("shree");                                         // its allow the duplicate value
		ll.contains(ll);
	//	ll.remove(3);
//      for (String i:ll) {
//    	  System.out.println(i);
//      }
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
      
		}
	}
}
