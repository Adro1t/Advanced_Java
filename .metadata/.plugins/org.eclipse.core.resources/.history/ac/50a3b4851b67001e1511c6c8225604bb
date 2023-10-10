package FilePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	FileInputStream input;
	FileOutputStream output;

	public ByteStreamDemo() {
		try {
			input = new FileInputStream("A:\\Vedas\\7th sem\\Advanced Java\\Files\\IN.txt");

			output = new FileOutputStream("A:\\Vedas\\7th sem\\Advanced Java\\Files\\OUT.txt");
			int c;

			while ((c = input.read()) != -1) {
				output.write(c);
			}
			;

		} catch (FileNotFoundException e) {
			System.err.println("Exception = " + e + " Provide proper file");
		} catch (IOException e) {

		}
	}

	public static void main(String[] args) {
		new ByteStreamDemo();

	}

}
