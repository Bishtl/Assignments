public class Even {
    public static void main(String[] args) {
        
        System.out.println("Enter the number");
        int no = new java.util.Scanner(System.in).nextInt();
        if(no%2==0){
            System.out.println(no+" is the even Number");
        }
        else{
            System.out.println(no+" is the odd number");
        }
    }
}
