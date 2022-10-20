package teleapps;

import java.util.Scanner;

public class user2
{
public static void main (String[ ] args){
	String n;
	Scanner s=new Scanner(System.in);
	System.out.println("plz enter the value");
	int num=s.nextInt();
	while (num!=0) {
		
	if (num>500) {
		
	
	switch (num) {
	case 2000: {
		  System.out.println("Your amount ="+num);
		  System.out.println("do want to change press yes otherwise ignore");
		  n=s.next();
		  System.out.println("take your change :");
		  System.out.println(num+"="+"500*4");
		  System.out.println("total="+"2000");
		  break;
		
	}
	case 1000:{
		 System.out.println("Your amount ="+num);
		  System.out.println("do want to change press yes otherwise ignore");
		  n=s.next();
		  System.out.println("take your change :");
		  System.out.println(num+"="+"500*2");
		  System.out.println("total="+"1000");
		  break;
	}
	case 500:{
		 System.out.println("Your amount ="+num);
		  System.out.println("do want to change press yes otherwise ignore");
		  n=s.next();
		  System.out.println("take your change :");
		  System.out.println(num+"="+"100*5");
		  System.out.println("total="+"500");
		  break;
	}
	
	}
	}
	else {
		System.out.println("your amount is to low");
		break;
	}
	}
	
	
}}

