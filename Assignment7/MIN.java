import java.util.*;
class MIN{
        public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the size of array");
           int size = scan.nextInt();
           int[]array = new int[size];
           for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
           }
           
           System.out.println("Elemet are ");
           for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
           }

           int min = array[0];
           for(int i=0;i<array.length;i++){
            if(array[i]<min)
                min=array[i]; 
            }
            System.out.println("Minimum element in this array are"+min);
           }
            
           
        }
    
