public class Customer extends Thread{
    private int id;
    private long shopTime;
    private long checkoutTime;
    private long enterTime;
    private long leaveTime;

    private long minShopTime = 3000;
    private long maxShopTime = 20000;

    private static int nextID = 0;
    //every customer will share the ID

    public Customer(){
        id = nextID;
        nextID++;
        enterTime = System.currentTimeMillis();
        shopTime = (long)(minShopTime + Math.random()* (maxShopTime-minShopTime));
        checkoutTime = 2000;
    }
    @Override
    public String toString(){
        return "Customer" + id;
    }
    @Override
    public void run(){
       while(enterTime + shopTime > System.currentTimeMillis()){

       }
       System.out.println(this.toString() + " is done shopping with shop time " + shopTime);
    }


}
