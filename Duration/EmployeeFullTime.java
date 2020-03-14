package T1908a.Duration;

public class EmployeeFullTime extends SalaryPolicy {
    private float rate;

    public EmployeeFullTime(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public  float getSalary(){
        return super.getBaseSalary() * this.rate;
    }

    public static void main(String[] args) {
        EmployeeFullTime e1 = new EmployeeFullTime(4f);
        System.out.println("The Salary: "+e1.getSalary());
    }
}
