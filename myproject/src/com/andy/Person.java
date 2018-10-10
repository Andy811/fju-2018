package com.andy;

public class Person {
	float height;
	float weight;

	public Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}

	public void hello() {
		System.out.println("Hello!!");
	}

	public float bmi() {
		float bmi = (float) weight / ((float) height * (float) height);
		return bmi;
	}
}
