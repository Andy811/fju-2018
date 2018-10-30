package com.andy;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Random random = new Random();
		int secret = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int answer = scanner.nextInt();
			System.out.println("Type a number: " + answer);
			System.out.println("your guess is: " + answer);
			if (answer > secret) {
				System.out.println("You were exceed by: " + (answer - secret));
			} else if (answer < secret) {
				System.out.println("You were off by: " + (secret - answer));
			} else {
				System.out.println("bingo");
				break;
			}
		}

		Scanner scanner01 = new Scanner(System.in);
		System.out.println("Your name?");
		String name = scanner01.nextLine();
		System.out.println(name);
		/*
		 * Person p = new Person(1.7f, 58f); System.out.println(p.bmi());
		 * p.hello();
		 */
		Student st = new Student("Andy", 90, 80);
		st.printGrade();

		System.out.println("666".equals("6"));
		System.out.println(6 == 6 ? "¬O" : "§_");
		Integer n1 = new Integer(10);
		Integer n2 = 10;
		System.out.println(n1 == n2);

	}

}
