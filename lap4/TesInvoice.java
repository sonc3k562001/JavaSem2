package T1908a.lap4.Customer;

public class TesInvoice {
    public static void main(String[] args) {
        Invoice in1= new Invoice();
        in1.ID=123;
        in1.customer=(new Customer(123,"Trần Văn A",20));
        in1.amount = 1234.4;
        System.out.println(in1.getAmountAfterDiscount());
    }
}
