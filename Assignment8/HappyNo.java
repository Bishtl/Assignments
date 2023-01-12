class HappyNo{
    public static void main(String[] args) {
        int n=19;
        int result = 0;
        while(n>=9){
            int a = n/10;
            int b = n%10;
            result = (a*a) + (b*b);
            n=result;
            if(result==1){
                System.out.println(result);
            }
            else{
                System.out.println(result);
            }
        }
        
    }
}