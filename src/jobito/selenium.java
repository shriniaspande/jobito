package jobito;

public class selenium {

	public static void main(String[] args) {
		int [] rollNo= {101,102,103,104,105};
//		
//		System.out.println("first element "+rollNo[0]);
//		System.out.println("second element "+rollNo[4]);
//		
	for (int i = 0; i<=rollNo.length;i++) {
	//	System.out.println("From the for loop "+rollNo[i]);
		}
	System.out.println("####################");
	
	for (int i:rollNo) {
		System.out.println("from the for each loop "+i);
	}
	}
}

// public = access specifier 
// static = keyword
// void   = return type
// main   = method name 
// args[] = array of string type