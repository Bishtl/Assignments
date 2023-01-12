import java.util.*;
class FrequencyCount
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[]arr = new int[size];
        for(int i=0;i<size;i++){
         arr[i]=scan.nextInt();
        }
        
        System.out.println("Elemet are ");
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
        countFrequency(arr, size);
     }
    static void countFrequency(int[] array, int size)
    {

        for (int i = 0; i < size; i++){
            int flag = 0;
            int count = 0;

            for (int j = i+1; j < size; j++){
                if (array[i] == array[j]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                continue;

            for (int j = 0;j<=i;j++){
                if (array[i] == array[j])
                    count++;
            }
            System.out.println(array[i]+": "+count);
        }
    }
}