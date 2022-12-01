public class Pattern6 {
    public static void main(String[] args) {
        int i , j, k=1;
        for(i=1;i<=5;i++){
            for(j=0;j<=5;j++){
                if(k==1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                k*=-1;
            }
            System.out.println("");
        }
    }
}
