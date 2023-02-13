import java.util.*;
public class Question31 {
    public static void main(String[] args) {
        int temp ;
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
        size = array.length;
   
   for(int i = 0; i<size; i++ ){
      for(int j = i+1; j<size; j++){
         if(array[i]>array[j]){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+array[size-3]);
   }
}

