class Question1{
    int c;
    int add(int a , int b){
        c=a+b;
        return c;
        
    }
    
    int add(int a , int b , int d){
        c=a+b+d;
        return c;
    }
    int add(int a , int b , int d, int e){
        c=a+b+d+e;
        return c;
    }
    int add(int a , int b ,int d , int e ,int f){
        c=a+b+d+e+f;
        return c;
    }
    public static void main(String[] args) {
        Question1 result = new Question1();
        System.out.println( result.add(5,3,2,1,4));

    }
}