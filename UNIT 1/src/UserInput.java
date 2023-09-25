import java.util.Scanner;

public class UserInput {
	int age;
	String name;
	float salary;

	public UserInput(int a, String n, float s) {
		this.age = a;
		this.name = n;
		this.salary = s;
	}

	void display() {
		System.out.println("name=" + name);
		System.out.println("age=" + age);
		System.out.println("salary=" + salary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = input.nextLine();

		System.out.println("Enter your age");
		int age = input.nextInt();
		// scanf("%d",&age)

		System.out.println("Enter your salary");
		float salary = input.nextFloat();
		UserInput user1 = new UserInput(age, name, salary);
		user1.display();

	}

}
