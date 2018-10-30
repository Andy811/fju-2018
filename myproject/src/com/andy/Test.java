package com.andy;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// int x =5*1.0; 錯誤
		int x = (int) (5.0 * 10);
		int y = 10 * 3;
		int z = 10 % 3;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		String name = "Andy";
		int age = 19;
		float weight = 55.555f;
		System.out.printf("Hello %s \n", name);
		System.out.printf("Your age: %d \n", age);
		System.out.printf("Your weight: %.2f \n", weight);// 四捨五入到小數點後第二位
		System.out.printf("1 %s 2 %d 3 %f \n", name, age, weight);
		// System.out.printf("ggggg 1 %s", name + "2 %d", age + "3 %f \n",
		// weight ); 出錯
		// System.out.printf("1 %s" + "2 %d", name, age);// 無法執行
		change();
		Temp temp = new Temp(10);
		System.out.println(temp.fehrenheight()+"F");
	}

	public static void change() {
		System.out.println("Please enter Celsius temperature:");
		Scanner input = new Scanner(System.in);
		float c = input.nextFloat();
		// float f = (float) (c*(9/5.0)+32.0);
		System.out.println("It equals" + (float) (c * (9 / 5.0) + 32.0) + "F");
	}


}
