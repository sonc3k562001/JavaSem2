package T1908a.lap3.Employee1_4;

public class Employee {
    private int id ;
    private  String firstName;
    private String lastName;
    private  int salary;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary =salary;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void  setLastName(){
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void setAnnuaSalary(int salary){
        this.salary =salary;
    }
    public int getAnnuaSalary(){
       return salary * 12;
    }
    public int raiseSalary(int percent){
        this.salary = salary * (percent/100);
        return salary;
    }
    public String toString(){
        return "Employee[ id = \t"+ id +" name \t"+firstName + lastName+"\t salary =" + salary+"]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Nguyễn","Giang Sơn",14);
        System.out.println(e1.toString());
    }
}
