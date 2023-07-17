package jobito;

import java.util.HashSet;

public class hashSet {
          public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<String>();
	
	hs.add("jai");
	hs.add("ajee");                       //store the only element as well as only unique
	hs.add("raj");                       // its maintain the insertion order 
	hs.add("null");                      //not maintain the acceding order 
	hs.add("raj");                       // not accepting duplicate value
	for (String str:hs) {
		                                  // non synchronized
		System.out.println(str);
	}
}
}
