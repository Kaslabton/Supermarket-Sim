import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Customer> customerdownshopping = new ArrayList<>();

        CustomerFactory customerFactory = new CustomerFactory(5000, 50, customers);
        customerFactory.start();

        Cashier cashier1 = new Cashier(5000, customers );
        cashier1.start();

        /*for(int i = 0; i< customers.size(); i++) {
            if(customers.get(i).IfDoneShopping()){
                customersdoneshopping.add(customers.get(i));
                customers.remove(customers.get(i));
            }
        }*/
    }
}