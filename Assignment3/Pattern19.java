public class Pattern19 {
    public static void main(String[] args) {
        int alphabet = 65;//ASCII value of 'A'
            for(int i = 1; i <=5; i++)
            {
                for(int j = 1; j <=5 ; j++)
                {
                    System.out.print((char)alphabet);

                    alphabet++;
                    if(i==5) {
                        
                        System.out.print((char) alphabet+"");
                        alphabet++;

                    }
                }
                System.out.println();
            }
    }
}
