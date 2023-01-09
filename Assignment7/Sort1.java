import java.util.Scanner;

public class Sort1
{
    public static void main(String args[])
    {
        int rows;
        int cols;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows u want in matrix ");
        rows=input.nextInt();
        System.out.println("Enter number of columns u want in matrix ");
        cols=input.nextInt();
        int Numbers[][]=new int[rows][cols];
        int temp;
        System.out.println("Enter integer values ");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
           Numbers[i][j]=input.nextInt();
        }
    }
    for(int i=1;i<rows;i++)
        {

            for(int a=1;a<cols;a++)
            {
                for(int j=1;j<cols-1;j++)
                if(Numbers[i][j]>Numbers[i][j+1])
                {
                    temp =  Numbers[i][j+1];
                    Numbers[i][j+1] = Numbers[i][j];
                    Numbers[i][j] = temp;

                }
               
            }
            
        }
       /*for(int i=0;i<rows;i++)
        {

            for(int j=0;j<cols-1;j++)
            {
                if(Numbers[i][j]>Numbers[i][j+1])
                {
                    temp =  Numbers[i][j];
                    Numbers[i][j] = Numbers[i][j+1];
                    Numbers[i][j+1] = temp;

                }
            }
        }*/
        
        System.out.println("sorted numbers in ascending order are : ");
        for (int i=0;i< rows;i++)
        {
            for (int j=0;j< cols;j++)
            {
               System.out.print(Numbers[i][j]+" ");
            }
        System.out.println();
}
}
}
