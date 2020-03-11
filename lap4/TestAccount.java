package T1908a.lap4.Customer;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.id=1;
        acc1.customer = (new Customer(948,"Trần Văn Tèo",120));
        acc1.balance = 300;
        System.out.println(String.valueOf(acc1));
        System.out.println(acc1.deposit(123));
        System.out.println(acc1.withdraw(123));
    }


}
