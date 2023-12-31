package FilePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int age;
	String gender;

	public Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toStringfy() {
		return "Name = " + name + ", Age = " + age + ", Gender = " + gender;
	}
}

public class ReadingWritingFileObjects {

	public static void main(String[] args) {
		Student s1 = new Student("A", 23, "Male");
		Student s2 = new Student("B", 21, "Female");
		File file = new File("A:\\Vedas\\7th sem\\Advanced Java\\Files\\Object.txt");
		try {
			FileOutputStream Fout = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(Fout);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.close();
			Fout.close();
			FileInputStream Fin = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(Fin);
			Student s3, s4;
			s3 = (Student) ois.readObject();
			s4 = (Student) ois.readObject();
			System.out.println(s3.toStringfy());
			System.out.println(s4.toStringfy());
			ois.close();
		} catch (Exception ex) {
			ex.printStackTrace();// it prints whole history of exception
		}
	}

}
