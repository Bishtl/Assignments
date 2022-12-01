
import java.io.*;

public class SumEvenOdd {
	public static void main(String[] args)
	{
		
		int evenSum = 0;
		int oddSum = 0;
        System.out.println("Enter the value");
        int n = new java.util.Scanner(System.in).nextInt();

		for (int i = 1; i <= 2 * n; i++) {
			
			if ((i & 1) == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		
		System.out.println("Sum of First " + n
						+ " Even numbers = " + evenSum);

		
		System.out.println("Sum of First " + n
						+ " Odd numbers = " + oddSum);
	}
}
