package jobito;

import java.util.ArrayList;
import java.util.Iterator;

public class lsitarray {

	

	public static void main(String[] args) {
	
	ArrayList<String>List=new ArrayList<String>();
	List.add("shyam");
	List.add("vijay");
	List.add("pravin");
	
	Iterator<String> itr=List.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
  }
}
