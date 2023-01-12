package ClassWork;

public class Default {
    int x;
    int y;
    Default(){
        x=10;
        y=20;

    }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Default t1 = new Default();
        t1.show();

        Default t2 = new Default();
        t2.show();
    }
    
}
