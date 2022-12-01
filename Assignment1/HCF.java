import java.util.*;

public class HCF {
    public static void main(String[] args) {
        int hcf=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first numberr");
        int a = in.nextInt();
        System.out.println("Enter the second Number");
        int b = in.nextInt();
        for(int i=1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        System.out.println("HCF value is "+hcf);
    }
}
