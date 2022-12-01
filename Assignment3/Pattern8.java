public class Pattern8 {
   public static void main(String[] args) {
    int a =65;
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.print((char)(j+64));
        }
        a++;
        System.out.println();
    }
   }
}
