package jobito;

public class fibonacci {                       // with recursion

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);       //printing 0 and 1
		
		for (i=2;i<count;++i)      // loop start form 2 because the 0 and 1 already print 
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
