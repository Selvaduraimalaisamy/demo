package teleapps;

import java.util.Scanner;

public class Sample2 {
	public static void main(String args[]) {
//		Scanner scan= new Scanner(System.in);
//		System.out .println("Enter the number");
//		int n=scan.nextInt();
		String str = "key=13,count=14|key=12,count=8|key=4,count=7";
		String s[] = str.split("\\|");
		int count = 0;
		String s4 = "";
		for (int i = 0; i < s.length; i++) {
			String data = s[i];
			System.out.println(data);
			String[] a = data.split("=");
			int g = Integer.parseInt(a[2]);
			//System.out.println(g);
			g = g + i + 1;
			String s3 = a[0] + "=" + a[1] + "=" + g;
			if (i == 0) {
				s4 = s3;
			} else {
				s4 = s4 + "|" + s3;
			}
		}
		System.out.println(s4);
	}
}
