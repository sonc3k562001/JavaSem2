package T1908a.lap4.Customer;

public class Invoice {
    int ID;
    Customer customer;
    double amount;
    void Invoice(int ID, Customer  customer, double amount){
        this.ID = ID;
        this.customer = customer;
        this.amount =amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return customer.name;
    }
    public  double getAmountAfterDiscount(){
        this.amount =amount - amount * customer.discount/100;
        return amount;
    }
}
