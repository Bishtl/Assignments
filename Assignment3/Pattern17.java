public class Pattern17 {
    public static void main(String[] args) {
        int alphabet = 65;

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print((char) (i+64));
            }
            alphabet++;
            System.out.println("");
        }
    }
}
