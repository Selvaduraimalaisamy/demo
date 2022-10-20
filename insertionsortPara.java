package teleapps;

import java.util.Arrays;

public class insertionsortPara {

	public static void main(String[] args) {

		int data[] = { 9, 5, 1, 4, 3 };
		System.out.println(Arrays.toString(data));
		insertionsortPara is = new insertionsortPara(data);
		System.out.println("sorted Array");
		System.out.println(Arrays.toString(data));

	}

	insertionsortPara(int arr[]) {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				--j;

			}
			arr[j + 1] = key;
		}
	}
}
