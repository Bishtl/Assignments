

class Cricketer{
    void cricketer(){
        System.out.println("Object is created");
    }
    protected void finalize(){
        System.out.println("Object is destroyed");
    }

}

class CricketerDemo{
    public static void main(String[] args) {
       // Cricketer c =  new Cricketer();
        //c=null; // 1. by assigning null;
        
        //Cricketer c1 = new Cricketer();
        //Cricketer c2 =  new Cricketer();
        //c1 = c2; // 2. By assigning of reference of other

        new Cricketer(); // By anonymous fuction
        System.gc();
    }
}