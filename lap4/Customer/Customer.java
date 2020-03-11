package T1908a.lap4.Customer;

public class Customer {
    int ID;
    String name;
    char gender;
    int discount;
    public Customer(int ID, String name,int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return " "+name+"("+getID()+")";
    }
}
