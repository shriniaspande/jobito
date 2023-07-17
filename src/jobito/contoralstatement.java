package jobito;

import java.util.Scanner;

public class contoralstatement {

	public static void main(String[] args) {
		int age;
		System.out.println("enter the age");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
			
		}
	}
}
