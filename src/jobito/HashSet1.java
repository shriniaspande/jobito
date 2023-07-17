package jobito;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Rohit");
		hs.add("Balaji");
		hs.add("Yogesh");
		hs.add("lahu");
		hs.add("lahu");
		for(String str:hs)
		{
			System.out.println(str);
		}
		
	}
}
