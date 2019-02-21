package DemoClass;

import java.util.Scanner;

public class CalcDemo {

	static int a, b, sum, sub;
	private static Scanner console;
	private static Scanner console1;

	public int reqAddition() {
		sum = a + b;
		return sum;
	}

	public int reqSubtraction() {
		sub = a - b;
		return sub;
	}

	public int getInputs() {
		console = new Scanner(System.in);
		System.out.println("Enter Value for A");
		a = console.next().charAt(0);

		console1 = new Scanner(System.in);
		System.out.println("Enter Value for A");
		return b = console1.next().charAt(0);
	}

	public static void main(String[] args) {

		CalcDemo reqAdd;
		reqAdd = new CalcDemo();
		reqAdd.getInputs();
		reqAdd.reqAddition();

		System.out.println(sum);

	}

}
