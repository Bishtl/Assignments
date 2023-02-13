
import java.util.Scanner;
class CreepyPattern2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		
		int i = 1;
		int k = 0;
		int lastPrint = 0;
		while(i <= n) {
			
			System.out.print("@");
			int space = 1;
			while(space <= (n-1)*k) {
				System.out.print(" ");
				space++;
			}
			
			int j = 1;
			while(j <= n) {
				System.out.print("*");
				j++;
			}
			
			if(i == n) {
				lastPrint = n + space;
				System.out.print("@");
			}
			k++;
			System.out.println();
			i++;
		}
		
		i = 1;
		while(i <= n) {
			if(i == 1)
			System.out.print("@");
		    else  
			System.out.print(" ");
		    
			int space = 1;
			while(space <= lastPrint - 1) {
				System.out.print(" ");
				space++;
			}
			System.out.println("@");
			i++;
			
		}
	}
}