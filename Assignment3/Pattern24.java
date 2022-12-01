public class Pattern24 {
    public static void main(String[] args) {
        
        int k;
        for(int i=1;i<=5;i++)
        {
            k=i;
            for(int j=1;j<=i;j++,k++)
            {
                System.out.print(k);
            }

            System.out.println("");
        }
    }
    
}
