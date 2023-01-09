
import java.util.*;


public class TriangleBmin {
    static int getMin(int b[],int c){
        int min=b[0];
        for(int i=1;i<c;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        return min;
    }
   public static void main(String[] args) {
    int a[][] = new int[3][3] , b[]=new int [10],c=0,k=0;
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter matrix Element");

    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Matrix is "+" ");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(i>j){
                b[k]=a[i][j];
                k++;
                c++;
            }
        }
    }
    System.out.println(" Minimum Matrix of Lower triangle is "+getMin(b, c));
   } 
}
