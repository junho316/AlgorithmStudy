package com.java.linearList;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int[] sale = new int[] { 157, 209, 251, 312 };

		for (int i = 0; i < sale.length; i++) {
			System.out.println((i + 1) + "분기  : " + sale[i]);
		}
	}
}
