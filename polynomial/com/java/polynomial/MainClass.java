package com.java.polynomial;

public class MainClass {

	public static void main(String[] args) {
		float[] a = new float[] { 4, 3, 5, 0 };
		float[] b = new float[] { 3, 1, 0, 2, 1 };

		Polynomial polynomialA = new Polynomial(3, a);
		Polynomial polynomialB = new Polynomial(4, b);

		OperatePoly operatePoly = new OperatePoly();
		Polynomial polynomialC = operatePoly.addPoly(polynomialA, polynomialB);
		System.out.print("A(x) = ");
		polynomialA.printPoly();
		System.out.print("B(x) = ");
		polynomialB.printPoly();
		System.out.print("C(x) = ");
		polynomialC.printPoly();
	}

}
