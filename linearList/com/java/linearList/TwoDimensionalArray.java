package com.java.linearList;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] sale = new int[][] { { 157, 209, 251, 312 }, { 1, 2, 3, 4 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println((j + 1) + "/4분기  : " + sale[i][j]);
			}
		}
	}
}
