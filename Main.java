import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: new matrix();
		break;
		case 2: new decimal();
		break;
		}
	}
}
