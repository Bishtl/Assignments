import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        System.out.println("Enter the value");
        int x= new Scanner(System.in).nextInt();
        for(int i = 1; i<=x;i++){
           fact = fact*i;
        }
        System.out.println(fact);
         
    }
}


    

