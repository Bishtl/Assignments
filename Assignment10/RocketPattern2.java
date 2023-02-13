import java.util.Scanner;
class RocketPattern2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:")
		int n = sc.nextInt();
		int i = 1;
		while(i <= (n/2+1)) {
			
			int space = 1;
			while(space <= (n/2 - i + 1)) {
				
				System.out.print(" ");
				space++;
			}
			
			int j = 1;
			while(j <= (2 * i) - 1) {
				System.out.print("*");
				j++;
			}
			
			i++;
			System.out.println();
		}
		
		i = 1;
		while(i <= (n - (n/2))) {
			
			System.out.print("@");
			int space = 2;
			while(space <= n - 1) {
				System.out.print(" ");
				space++;
			}
			System.out.print("@");
			i++;
			System.out.println();
		}
		
		i = 1;
		while(i <= n/2) {
			
			System.out.print("@");
		
			int space1 = 1;
			while(space1 <= (n/2) - i) {
				System.out.print(" ");
				space1++;
			}
			
			int j = 1;
			while(j <= (2 * i) - 1) {
				System.out.print("*");
				j++;
			}
			
			int space2 = 1;
			while(space2 <= (n/2) - i) {
				System.out.print(" ");
				space2++;
			}
			
			System.out.print("@");
		     
			System.out.println();
			i++;
            			
		}
		
		i = 1;
		while(i <= n) {
			System.out.print("*");
			i++;
		}
		
	}
}