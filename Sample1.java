package teleapps;

public class Sample1 {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		String s = " key = 10 , count = 2 || key = 20 , count = 3 || key = 20 , count = 3 || key = 40 , count = 2";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if ("=".equals(s1[i])) {
				String a = s1[i + 1];
				int n = Integer.parseInt(a);
				count++;
				if (count % 2 == 0) {
					count1++;
					System.out.println(n + count1);
				}

			}
		}
	}
}
