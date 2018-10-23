package com.andy;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RangeTester {

	public static void main(String[] args) {

		System.out.println("enter number");
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
		System.out.println("*" + line + "*");
		System.out.println(-3 <= line && line <= 5);
	}

}
