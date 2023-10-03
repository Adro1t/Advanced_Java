package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception handling Try-Catch-Finally/Throw/Throws

public class ConceptofException {
	public static int division(int num, int denom) {
		return num / denom;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, d;
		boolean continueLoop = true;
		do {
			try {
				System.out.println("enter numenator : ");
				n = in.nextInt();// input mismatch
				System.out.println("enter denominator : ");
				d = in.nextInt();// input mismatch
				System.out.println("division = " + division(n, d));
				System.out.println();// arithmetic exception
//			in.close();
				continueLoop = false;
			} catch (InputMismatchException ex) {
				System.err.println("exception is " + ex);
				in.nextLine();// new line
				System.out.println("enter valid data");
			} catch (ArithmeticException ex) {
				System.err.println("exception is " + ex);
				System.out.println("enter non zero denominator");
			}
			finally {
				System.out.println("always executes");
			}
		} while (continueLoop);
		in.close();
	}

}