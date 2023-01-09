import java.util.*;
class MAX{
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

           int max = array[0];
           for(int i=0;i<array.length;i++){
            if(array[i]>max)
                max=array[i]; 
            }
            System.out.println("Maximum element in this array are "+max);
           }
            
           
        }
    
