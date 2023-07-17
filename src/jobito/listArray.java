package jobito;

import java.util.ArrayList;
import java.util.Iterator;

public class listArray {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ram");
		list.add("sham");
		list.add("vijay");
		list.add("sham");
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
		
		for (String str:list) {
			System.out.println(str);
		}
		}
	}

