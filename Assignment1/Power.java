import javax.naming.spi.DirStateFactory.Result;

public class Power {
    public static void main(String[] args) {
        int pow;
        System.out.println("Enter the first value");
        int x1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter second value");
        int x2 = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i < x2; i++) {
            x1=x1*x2;
            
        }
        pow=x1;
        System.out.println(pow);
    }
   
    
}
