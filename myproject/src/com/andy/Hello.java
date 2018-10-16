package com.andy;

public class Hello {

	public static void main(String[] args) {
		Person p = new Person(1.7f, 58f);
		System.out.println(p.bmi());
		p.hello();

		Student st = new Student("Andy", 90, 80);
		st.printGrade();
		
		System.out.println("666".equals("6"));
		System.out.println(6==6? "¬O":"§_");
		Integer n1 = new Integer(10);
		Integer n2 = 10;
		System.out.println(n1==n2);
		
	}

}
