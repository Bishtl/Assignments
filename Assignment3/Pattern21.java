public class Pattern21 {
   public static void main(String[] args) {
    for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++) {

                if (i == 1) {
                    System.out.print((char) (j + 64));
                } else if (i == 2) {
                    System.out.print((char) (j + 96));
                } else if (i == 3) {
                    System.out.print((char) (j + 64));
                } else if (i == 4) {
                    System.out.print((char) (j + 96));
                } else if (i == 5) {
                    System.out.print((char) (j + 64));
                }
            }
            //alphabet++;
            System.out.println("");
        }
   } 
}
