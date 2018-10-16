package com.andy;

public class Student {
	String name;
	int en, ma;

	public Student(String name, int en, int ma) {
		this.name = name;
		this.en = en;
		this.ma = ma;
	}

	public void printGrade() {
		System.out.println(name + "\t" + en + "\t" + ma + "\t" + (en + ma) / 2);
	}

}
