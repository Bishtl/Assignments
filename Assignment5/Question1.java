import java.util.*;
class Question1{
    static int n;
    void Cal(){
        if(n%3==0){
            System.out.println("I like coffee");
        }
        else if(n%5==0){
            System.out.println("I Like Tea");
        }
       else if(n%3==0 && n%5==0){
        System.out.println("I like coffee and Tea");
       }
       else{
        System.out.println("We don't Like anything");
       }

    }
    public static void main(String[] args) {
        System.out.print("Enter a Number");
         n = new Scanner(System.in).nextInt();
         Question1 result = new Question1();
         result.Cal();
    }
}