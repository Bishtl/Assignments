import java.util.*;
class Sort{
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

          for(int i=0;i<array.length;i++){
            {
               for(int j=i+1;j<array.length;j++){
                  int temp = 0;
                  if(array[i]>array[j]){
                     temp = array[i];
                     array[i]=array[j];
                     array[j]=temp;
                  }
                  
               }
               System.out.println(array[i]);
            }
            
          }
        }
            
           
        }
    
