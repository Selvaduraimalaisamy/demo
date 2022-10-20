package teleapps;

import java.util.Scanner;

public class Password {
	static Scanner s=new Scanner(System.in);
	static String rec="";
	static String enter="";
public static void main(String[] args) {
	
	System.out.println("Create your password");
	String rec=s.nextLine();
	System.out.println("your password is :"+rec);
	System.out.println("enter your login id.......");
	String mem=s.next();
	System.out.println("Enter your password.......");
	String enter=s.next();
	if (rec.equals(enter)) {
		System.out.println("Login.....");
	}
	else {
		System.err.println("you have enter wrong password");
		System.out.println("plz enter correct password");
		hello();
	}
	
}

private static void hello() {
	System.out.println("Enter your password.......");
	String enter=s.next();
	System.out.println("login.....");
}

}
