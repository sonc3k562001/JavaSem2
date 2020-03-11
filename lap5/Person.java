package T1908a.lap5;

public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(){
        this.address = address;
    }
    public String toString(){
        return ""+this.name+"("+this.address+")";
    }
}
