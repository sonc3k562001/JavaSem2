package T1908a.lap3.Employee1_4;

public class time {
    int hour ;
    int minute;
    int second;


    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String toString(){
        return String.format("%2d: %2d: %2d",hour,minute,second);
    }
    public time nextSecond (int hour, int minute, int second){
        second++;
        if (second==60){
            second =0;
            minute++;
            if (minute==60){
                minute=0;
                hour++;
                if (hour<24){
                   hour=0;
                }
            }
        }
        return this;
    }
    public static void main(String[] args) {
        time t1 = new time(1,23,56);
        time t2 = new time(2,45,43);
        System.out.println("hour:\t"+t1.hour);
        System.out.println("minute:\t"+t1.minute);
        System.out.println("second:\t"+t1.second);
        System.out.println(t2.toString());
    }
}
