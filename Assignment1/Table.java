import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt(); 

        for(int i=a;i<=a*10;i+=a){
            System.out.println(i);
        }
    }
}
