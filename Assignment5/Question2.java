public class Question {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=5;i++){
            System.out.print("\n");
            for(int j=1;j<=n;j++){
                if(i==1 || i==5 || j==1 || j==5){
                        System.out.print("S ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}