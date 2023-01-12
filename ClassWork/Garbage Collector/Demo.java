public class Demo {
    int x =10;
    int y = 20;
    static Demo z;
    public void finalize()
        throws Throwable{
            z=this;
            System.out.println("Jawan Shaheed");
        }
    
    class Temp{
        static void show(){
            Demo d2=new Demo();
            display();
        }
        static void display(){
            Demo  d3 = new Demo();

        }
        public static void main(String[] args) {
            show();
        
        for(int i = 1; i<=2000; i++){
            new Demo();
        }
    }
    }
}
