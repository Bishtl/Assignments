import java.util.*;;
class FirstNonRepeating {

	static int firstNonRepeating(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			int j;
			
			for (j = 0; j < n; j++)
				if (i != j && arr[i] == arr[j])
					break;
			if (j == n)
				return arr[i];
		}

		return -1;
	}

	public static void main(String[] args)
	{

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
        System.out.print(firstNonRepeating(arr, n));
	}
    
}


