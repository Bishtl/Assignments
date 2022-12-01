class Mobike{
    String bno;
    String name;
    int days;
    int result;

    void input(){
        System.out.println("Enter the bike number");
        bno = new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter the customer name");
        name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Enter the no. of Days");
        days = new java.util.Scanner(System.in).nextInt();
    }
    void compute(){
        if(days>0 && days<=5){
             result = days*500; 
             System.out.println("Charge is"+result);
        
        }
         if(days>5 && days<=10){
           result = 2500+(days-5)*400;
           System.out.println("Charge is"+result);
            
        }
        if(days>10){
            result = 2500+2000+(days-10)*200;
            System.out.println("Charge is "+result);

        }
    }
    void display(){
        System.out.println("Bike number "+bno);
        System.out.println("Name "+name);
        System.out.println("Number of  days "+days);
        System.out.println("Charge "+result);
    }
     
    public static void main(String[] args) {
        Mobike a = new Mobike();
        a.input();
         a.compute();
         a.display();
        
    }
}