package com.andy;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("Are you 18? (Yes/No)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("*" + line + "*");
		boolean adult = line.toUpperCase().equals("Yes");
		if (adult) {
			System.out.println("Your age?");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Your name?");
			String name = scanner.nextLine();
			System.out.println("Your nick name?");
			String nickName = scanner.nextLine();
			System.out.println(age + "/" + name + "/" + nickName);

		} else {
			System.out.println("gg");
		}
	}

}
