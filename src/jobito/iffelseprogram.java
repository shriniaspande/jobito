package jobito;

import java.util.Scanner;

public class iffelseprogram {

	public static void main(String[] args) {
		
		System.out.println("enter the value");
		Scanner r=new Scanner(System.in);
		int a = r.nextInt();
        int b = r.nextInt();
        
        if (a==b) {
        	System.out.println("print Equal");
        }
//        else {
//        	if(a<b) {                                        first step
//        		System.out.println("print greater");
//        	}
        else if (a<b){
        	System.out.println("print greater");           // second setp
        }
        	else {
        		System.out.println("lesser");
        	}
        }
		}
	
	

