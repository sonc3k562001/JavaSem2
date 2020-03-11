package T1908a.lap3.Employee1_4.acc;

public class account2 {
    private String id;
    private String name;
    private int balance=0;

    public account2(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    account1 a1 = new account1("hsffskf","Nguyễn Giang Sơn",2555);
    account2 a2 = new account2("kafafj","Trần Thị Bưởi",1222);
    int trangsfer =0 ;
    public void setTrangsfer(int trangsfer) {
        this.trangsfer = trangsfer;
    }

    public int getTrangsfer() {
        return trangsfer;
    }

    public account1 getA1() {
        return a1;
    }

    public static void main(String[] args) {

    }
}
