package java_guru99;

import java.lang.reflect.Method;


public class Exceptions {

	public static void main(String args[]) {
		int d = 0;
		int n = 20;
		try {
			int fraction = n / d;
			System.out.println("This line will not be Executed");
		} catch (Throwable e) {
			System.out.println("In the catch Block due to Exception = " + e);
			e.printStackTrace();
		}

		try {
			int g[] = { 1 };
			g[0] = 100;
		} catch (ArithmeticException e) {
			System.out.println("In the catch clock due to Exception = " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch clock due to Exception = " + e);
			e.printStackTrace();
		} finally {
			System.out.println("Inside the finally block");
		}
		System.out.println("End Of Main");
	}// main
}// class
