import java.util.ArrayList;
import java.util.Stack;

public class Cashier extends Thread{

    private ArrayList<Customer> customerdownshopping;
    private long TimeStarttoCheck;
    private long CheckTime;
    private long minCheckTime = 3000;
    private long maxCheckTime = 20000;

    private long nextAttempt;
    private long timeSlice;
    private ArrayList<Customer> customers;
    private int count = 0;



    public Cashier( long timeSlice, ArrayList<Customer> customers){
        TimeStarttoCheck = System.currentTimeMillis();
        CheckTime = (long)(minCheckTime + Math.random()* (maxCheckTime-minCheckTime));
        this.customers=customers;
        nextAttempt = System.currentTimeMillis() + this.timeSlice;
    }

    @Override
    public void run(){
        ArrayList<Customer> customerdownshopping = new ArrayList<Customer>();
        while(true){
            if(customers.size()>=1) {
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).ifdoneshopping()) {
                        customerdownshopping.add(customers.get(i));
                        System.out.println("People waiting in the line: ");
                        System.out.println(customerdownshopping);
                        System.out.println("");
                        customers.remove(i);
                        i--;
                    }
                    for (int j = 0; j < customerdownshopping.size(); j++) {
                        if (CheckTime + TimeStarttoCheck > System.currentTimeMillis()) {

                        } else {
                            System.out.println("Customer" + customerdownshopping.get(j).getId() + " Checked out");
                            System.out.println("");
                            customerdownshopping.remove(customerdownshopping.get(j));
                            j--;
                        }
                    }

                }


            }
        }
    }
}
