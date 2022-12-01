public class Pattern20 {
    public static void main(String[] args) {
        int alphabet = 65;

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++) {
                if (i == 1) {
                    System.out.print("*");
                } else if (i == 2) {
                    System.out.print((char) (j + 64));
                } else if (i == 3) {
                    System.out.print("*");
                } else if (i == 4) {
                    System.out.print((char) (j + 64));
                } else if (i == 5) {
                    System.out.print("*");
                }
            }
            alphabet++;
            System.out.println("");
        }
    }
}
