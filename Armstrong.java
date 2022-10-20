package teleapps;

import java.util.Scanner;

public class Armstrong {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0, r, digit = 0;
		int num1 = num;
		while (num > 0) {
			num = num / 10;
			digit++;
			
		}
		System.out.println(digit);
		num = num1;
		while (num > 0) {
			r = num % 10;
			sum = (int) (sum + (Math.pow(r, digit)));
			num = num / 10;
		}

		if (num1 == sum) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("not Amstrong Number");
		}

	}

}
