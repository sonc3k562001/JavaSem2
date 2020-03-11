package T1908a.lap3.Employee1_4;

public class date {
    private int day ;
    private int month;
    private int year;

    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public  String toString(){
        return String.format("%02d/%02d/%4d",month,day,year);
    }

    public static void main(String[] args) {
        date d1 = new date(25,7,2001);
        date d2 = new date(1,4, 2020);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
