package Unit1Package;

import java.util.Scanner;

public class TestPackage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fact = 1, num;
		System.out.println("Enter a number");
		num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
			
		}
		System.out.printf("the factorial is %d",fact);
	}

}
