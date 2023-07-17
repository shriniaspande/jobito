package jobito;

public class superclass extends superstaticfinal{
    int SrNo;
	String Name;
	int age;
	void show () {
      System.out.println(super.age);
      System.out.println("enter age is");
	}
	void studantDetails() {
		super.studantDetails();
		System.out.println(SrNo);
		System.out.println(Name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		superclass sc=new superclass();
		sc.SrNo=3;
	    sc.Name="Vijay";
		sc.age=32;
		sc.show();
		sc.studantDetails();
	}
}
