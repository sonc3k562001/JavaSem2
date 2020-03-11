package T1908a.lap3.Employee1_4.acc;

class account1 {
    private String id;
    private String name;
    private int balance =0;

    public account1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public account1(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int creadit(int amount){
        return balance;
    }
    public  int debit(int amount){
        if(amount <= balance){
            this.balance +=amount;
        }else{
            System.out.println("amount exceeded");
        }
        return balance;
    }
    public String toString(){
        return "Account[ id ="+ id+"\t, name = "+ name+"\t, balance = "+balance+"]";
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
    public static void main(String[] args) {
        account1 a1 = new account1("313924", "Nguyễn Giang Sơn", 139839);
        System.out.println(a1.toString());
    }


}
