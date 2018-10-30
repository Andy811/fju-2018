package com.andy;

public class Temp {

	double c;
	double f;

	public Temp(double c) {
		this.c = c;

	}

	public double fehrenheight() {
		return f = (double) (c * (9 / 5.0) + 32);
	}

}
