package jobito;

public class reverse {

	public static void main(String[] args) {          
		String stateName="maharashtra";
		
		for (int i=stateName.length()-1;i>=0;i--) {       // reverse string program
			System.out.println(stateName.charAt(i));
		}
	}
}
