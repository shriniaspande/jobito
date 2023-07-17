package jobito;

public class arrayDemo {

	public static void main(String[] args) {
		int arr[];
		
		arr= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
	//	arr[5]=60;
		
		for (int i=0;i<=arr.length;i++) {
		//	System.out.println("element at index "+i+";"+arr[i]);  // print index with value [0=10]
			
			System.out.println(arr[i]);                           // print only value 10,20,30
		}
	}
}
