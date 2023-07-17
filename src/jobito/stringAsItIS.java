package jobito;

public class stringAsItIS {

	public static void main(String[] args) {
		String stateName="maharashtra";
		
//		for(int i=0;i<stateName.length();i++) {
//			System.out.println(stateName.charAt(i));         // string values printing as it is 
//		}
		
		StringBuffer sb=new StringBuffer(stateName);
		System.out.println(sb.reverse());                    // string reverse to the string buffer 
		
	}
}
