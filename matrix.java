import java.util.Scanner;

public class matrix {
	matrix(){
	
		int a,b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int N = scanner.nextInt();
		
		int[][] arr_1 = new int[N][N]; 
		for(a=0;a<arr_1.length;a++) {
			for(b=0;b<arr_1.length;b++) {
				System.out.print("["+a+"]["+b+"] : "); 
				arr_1[a][b] = scanner.nextInt();
			}
		}
		
		System.out.println("---------------------------------");
		
		int i,j;
		
		int[][] arr_2 = new int[N][N];
		for(i=0;i<arr_2.length;i++) {
			for(j=0;j<arr_2.length;j++) {
				System.out.print("["+i+"]["+j+"] : "); 
				arr_2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print("Enter process: ");
		Scanner process = new Scanner(System.in);
		String input = process.nextLine();
		switch(input) {
			case "+" : 
				int[][] sum = new int[N][N];
				for(int sum_1 = 0;sum_1<sum.length;sum_1++) {
					for(int sum_2 = 0;sum_2<sum.length;sum_2++) {
						sum[sum_1][sum_2] = arr_1[sum_1][sum_2] + arr_2[sum_1][sum_2]; 
						System.out.print("["+sum[sum_1][sum_2]+"]");
					}System.out.println();
				}
			break;
			case "-" : 
				int[][] minus = new int[N][N];
				for(int minus_1 = 0;minus_1<minus.length;minus_1++) {
					for(int minus_2 = 0;minus_2<minus.length;minus_2++) {
						minus[minus_1][minus_2] = arr_1[minus_1][minus_2] - arr_2[minus_1][minus_2]; 
						System.out.print("["+minus[minus_1][minus_2]+"]");
					}System.out.println();
				}
			break;
			case "*" : 
				int[][] mult = new int[N][N];
				for(int mult_1 = 0; mult_1<mult.length;mult_1++) {
					for(int mult_2 = 0; mult_2<mult.length;mult_2++) {
						for(int k = 0; k < mult.length;k++) {
							mult[mult_1][mult_2]+=arr_1[mult_1][k] * arr_2[k][mult_2];
						}
						System.out.print("["+mult[mult_1][mult_2]+"]");
					}System.out.println();
				}
			break;
			default : System.out.println("Choose correct operation");
		}
	}
}
