public class Pattern16 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            int k=68+i;
            for(int j=1; j<=5; j++)
            {
                System.out.print((char)k--);

            }
            System.out.println();
        }
            
        }
    }
    