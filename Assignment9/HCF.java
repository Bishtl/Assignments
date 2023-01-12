import java.util.*;
    
public class HCF {
	
	static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	
	static int findGCD(int arr[], int n)
	{
		int result = arr[0];
		for (int element: arr){
			result = gcd(result, element);

			if(result == 1)
			{
			return 1;
			}
		}

		return result;
	}


     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[]arr = new int[size];
        int n = arr.length;
        for(int i=0;i<size;i++){
         arr[i]=scan.nextInt();
        }
        
        System.out.println("Elemet are ");
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
        System.out.println(findGCD(arr, n));
     }
}