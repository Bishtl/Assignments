
import java.util.*;


public class TriangleBmax {
   public static void main(String[] args) {
    int a[][] = new int[3][3];
    int i,j,max=0;
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
                max=a[i][j];
            }
        }
    }
    System.out.println("Max of lower triangle is "+max);
   } 
}
