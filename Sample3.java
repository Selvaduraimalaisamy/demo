package teleapps;

import java.util.Scanner;

public class Sample3 {
	public static void main(String args[]) {
		int g;
		int count = 0;
		String s4 = "";
		String s6 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		String n = scan.next();
		String str = "key=13,count=14|key=12,count=8|key=4,count=7";
		String s[] = str.split("[=,\\|]");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(n)) {
				if ("count".equals(s[i + 1])) {

					s4 = s[i + 2];
					g = Integer.parseInt(s4);

					g = g + 1;
					s6 = String.valueOf(g);

				}

			}

		}

		System.out.println(str.replace(s4, s6));
	}

}
