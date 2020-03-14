package T1908a.Duration;

public class EmployeePartime extends SalaryPolicy {
    private float rate;

    public EmployeePartime(float rate) {
        this.rate = rate;
    }

    @Override
    public float getSalary(){
        return  super.getBaseSalary()* this.rate;
    }

    public static void main(String[] args) {
        EmployeePartime s2 = new EmployeePartime((float) 2.5);
        System.out.println(s2.getSalary());
    }
}
