public class Pattern9 {
    public static void main(String[] args) {
        int row=1,n=5;
        while(row<=n){
            int col = 1;
            while(col<=n){
                if(row%2==0){
                    System.out.print(row);
                }
                else{
                    System.out.println("*");
                }
                col++;
            }
        }
    }
}
