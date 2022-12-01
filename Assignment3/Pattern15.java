public class Pattern15 {
   public static void main(String[] args) {
    for(int i =0;i<=5;i++){
        int a=65; 
        for(int j=0;j<=5;j++ ){
            System.out.print((char)(a+i+j));
        }
        System.out.println();
    }
   } 
}
