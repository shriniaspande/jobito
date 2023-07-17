package jobito;

import java.util.Scanner;

public class Switchstatment {

	public static void main(String[] args) {
		int colour;
		System.out.println("enter the No");
		Scanner r=new Scanner(System.in);
		colour=r.nextInt();
		
		switch(colour) 
		{
		case 1:
			System.out.println("Blue ");
		break;
		case 2:
			System.out.println("Red");
		break;
		case 3:
			System.out.println("Yellow");
		break;
		case 4:
			System.out.println("Green");
		break;
		default:
			System.out.println("incorrect cardantial");
		}
		
	}
}
