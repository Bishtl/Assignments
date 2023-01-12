// JAVA code to implement the approach
import java.util.*;
class NumtoWord {
public static void convert(int arr[], int N)
{
	HashMap<Integer, String> mp = new HashMap<>();
	int i;

	
	mp.put(0, "zero");
	mp.put(1, "one");
	mp.put(2, "two");
	mp.put(3, "three");
	mp.put(4, "four");
	mp.put(5, "five");
	mp.put(6, "six");
	mp.put(7, "seven");
	mp.put(8, "eight");
	mp.put(9, "nine");
	for (i = 0; i < N; i++)
	System.out.print(mp.get(arr[i]) + " ");

	System.out.println();
}

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[]arr = new int[size];
        int N = arr.length;
        for(int i=0;i<size;i++){
         arr[i]=scan.nextInt();
        }
        
        System.out.println("Elemet are ");
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
        convert(arr, N);
     }
}



