package mainyS;

import java.util.Scanner;

//WAP to check equality of array 
public class ArrayQ6 {
	static void equalArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Value");
		String[] array1 = sc.nextLine().split(",");
		System.out.println("Enter Second Array Value");
		String[] array2 = sc.nextLine().split(",");

		int[] arr1 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			arr1[i] = Integer.parseInt(array1[i]);
		}

		int[] arr2 = new int[array2.length];
		for (int j = 0; j < array2.length; j++) {
			arr2[j] = Integer.parseInt(array2[j]);
		}

		if (arr1.length != arr2.length) {
			System.out.println("Given two array are not identical");
		}

		boolean flag = false;
		if (arr1.length == arr2.length) {
			for (int m = 0; m < arr1.length; m++) {
				if (arr1[m] == arr2[m]) {
					flag = true;
				}
			}
		}
		if (flag) {
			System.out.println("Array are identical");
		}

	}

	public static void main(String args[]) {
		equalArray();
	}
}
