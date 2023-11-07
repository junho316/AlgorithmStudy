package com.javaStudy.linearList;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int[][][] sale = new int[][][] { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } },
				{ { 9, 10, 11, 12 }, { 13, 14, 15, 16 } } };

		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + "팁");
			for (int j = 0; j < 2; j++) {

				for (int k = 0; k < 4; k++) {
					System.out.println((j + 1) + "/4분기  : " + sale[i][j][k]);
				}
			}

		}
	}
}
