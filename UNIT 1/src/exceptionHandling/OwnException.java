package exceptionHandling;

import java.util.Scanner;


class CustomException extends Exception {
	public CustomException(String mess) {
		super(mess);
	}
}

public class OwnException {

	public static void StudentAge(int age) throws CustomException {
		if (age < 0)
			throw new CustomException("AgeLessThanZeroException");
		else	
			System.out.println("Valid Age");
	}

	public static void main(String[] args) throws CustomException {
		boolean continueLoop = true;
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter your age :");
				int age = input.nextInt();
				StudentAge(age);
				continueLoop = false;
			} catch (CustomException ex) {
				System.err.println("The exception is " + ex);
				System.out.println("Enter Valid Age");
			} finally {
				System.out.println("Custom Exception Handled");
			}
		} while (continueLoop);
		input.close();
	}

}
