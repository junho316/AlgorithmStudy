package com.java.polynomial;

public class Polynomial {

	private int degree;
	private float coef[] = new float[20];

	public Polynomial(int degree, float[] coef) {
		this.degree = degree;
		this.coef = coef;
	}

	public Polynomial(int degree) {
		this.degree = degree;
		for (int i = 0; i < degree; i++) {
			this.coef[i] = 0;
		}
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public float getCoef(int i) {
		return this.coef[i];
	}

	public void setCoef(int i, float coef) {
		this.coef[i] = coef;
	}

	public void printPoly() {
		int temp = this.degree;
		for (int i = 0; i <= this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		System.out.println("");
	}
}
