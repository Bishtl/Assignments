
import java.util.Scanner;
class CreepyPattern1 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			System.out.println("@");
			i++;
		}
		
		i = 1;
		int k = 1;
		int lastPrint = 0;
		while(i <= n) {
			
			if(i == 1)
			System.out.print("@");
		
		    if(i == 2) {
				int space = 1;
				while(space <= n) {
					System.out.print(" ");
					space++;
				}
			}
			
			int space = 1;
			if(i > 2) {
			while(space <= n + (n - 1)*k) {
				if(i == 1) {
					space++;
					continue;
				}
				System.out.print(" ");
				space++;
			}
			k++;
			
		}
			
			int j = 1;
			while(j <= n) {
				System.out.print("*");
				j++;
			}
			
			if(i == n) {
				lastPrint = space + (n - 1);
				System.out.print("@");
			}
			System.out.println();
			i++;
			
		}
		
		i = 1;
		while(i <= n) {
			
			int space = 1;
			while(space <= lastPrint) {
				System.out.print(" ");
				space++;
			}
			System.out.println("@");
			i++;
		}
	}
}