public class Pattern18 {
    public static void main(String[] args) {
        int alphabet = 65;

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print((char) (j+64));
            }
            alphabet++;
            System.out.println("");
        }
    }
}
