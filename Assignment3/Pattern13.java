public class Pattern13 {
    public static void main(String[] args) {
        for(int i=5; i<=9; i++)
        {
            for(int j=i; j>i-5; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
