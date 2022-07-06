import java.util.Scanner;

public class decimal {
	decimal(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number system : ");
		int system = scanner.nextInt();

		System.out.println("Your num: ");
		int num = scanner.nextInt();
		
		switch(system) {
		case 2: transfer_2(num);
		break;
		case 8: transfer_8(num);
		break;
		case 16: transfer_16(num);
		break;
		default: System.out.println("Choose correct system");
		}
		
	}
	public void transfer_2(int num) {
		String system_2 = Integer.toBinaryString(num);
		System.out.println(system_2);
	}
	public void transfer_8(int num) {
		String system_8 = Integer.toOctalString(num);
		System.out.println(system_8);
	}
	public void transfer_16(int num) {
		String system_16 = Integer.toHexString(num);
		System.out.println(system_16);
	}
}
