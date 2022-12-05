public class Question8 {
    public static void main(String[] args) {
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || i==2 || i==4 || i==5 ||j==1 || j==2 || j==4 || j==5  ){
                    System.out.print(" S ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

    }
}
