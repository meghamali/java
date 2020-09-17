package com.megha;

/**
 * @author megha
 * sorted array
 */

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String... args) {

		int[] myArray = getIntegerArray(5);

		printArray(myArray);

		System.out.println("*********************************************");

		printArray(sortedArray(myArray));

	}

	public static int[] getIntegerArray(int capacity) {

		int[] array = new int[capacity];
		System.out.println("Size of array: " + capacity);

		for (int i = 0; i < capacity; i++) {
			array[i] = sc.nextInt();
		}

		return array;
	}

	public static void printArray(int[] array) {

		for (int i = 0, n = array.length; i < n; i++) {

			System.out.println("Element of " + i + " is " + array[i]);
		}

	}

	public static int[] sortedArray(int[] array) {

		int temp;
		for (int i = 0, n = array.length; i < n; i++) {
			temp = array[i];

			for (int j = 0; j < n - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		return array;

	}
}
