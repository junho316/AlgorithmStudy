package com.java.polynomial;

public class OperatePoly {

	private int degreeA = 0;
	private int degreeB = 0;
	private int degreeC = 0;
	private int indexA = 0;
	private int indexB = 0;
	private int indexC = 0;

	private int expoA, expoB;

	public Polynomial addPoly(Polynomial A, Polynomial B) {
		degreeA = A.getDegree();
		degreeB = B.getDegree();
		expoA = degreeA;
		expoB = degreeB;

		if (degreeA >= degreeB) {
			degreeC = degreeA;
		} else {
			degreeC = degreeB;
		}

		Polynomial polynomialC = new Polynomial(degreeC);

		while (indexA <= degreeA && indexB <= degreeB) {
			if (expoA > expoB) {
				polynomialC.setCoef(indexC++, A.getCoef(indexA++));
				expoA--;
			} else if (expoA == expoB) {
				polynomialC.setCoef(indexC++, A.getCoef(indexA++) + B.getCoef(indexB++));
				expoA--;
				expoB--;
			} else {
				polynomialC.setCoef(indexC++, B.getCoef(indexB++));
				expoB--;
			}
		}

		return polynomialC;
	}
}
