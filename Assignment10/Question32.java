
import java.util.*;

class Question32{
    
	// Function for calculating median
	public static double median(int arr[], int n){
		// First we sort the array
		Arrays.sort(arr);

		// even case
		if (n % 2 != 0)
			return (double)arr[n / 2];

		return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
         array[i]=scan.nextInt();
        }
        
        System.out.println("Elemet are ");
        for(int i=0;i<array.length;i++){
         System.out.println(array[i]);
        }
		int n = array.length;

		System.out.println(median(array, n));
	}
}

