package jobito;


public class superstaticfinal {
    int SrNo;
	String name;
	static String CollegeName="ITM";
	int age=31;
	
 void studantDetails() {
	   	System.out.println(SrNo);
		System.out.println(name);
		System.out.println(CollegeName);
		System.out.println(age);
	}
	public static void main(String[] args) {
		superstaticfinal sd1=new superstaticfinal();
		sd1.SrNo=1;
		sd1.name="shrinias";
		sd1.age=29;
		sd1.studantDetails();
		superstaticfinal sd2 = new superstaticfinal();
		sd2.SrNo=2;
		sd2.name="balaji";
		sd2.age=29;
		sd2.studantDetails();
	}
	
}
