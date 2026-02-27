public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day){
        if(day>=1&&day<=31)
            this.day=day;
    }

    public void setMonth(int month) {
        if(month>=1&&month<=12)
            this.month = month;
    }

    public void setYear(int year) {
        if(year>0)
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

    public String toString(){
        return String.format("%02d-%02d-%d",day,month,year);
    }

    public String getUnversalDateFormat(){
        return String.format("%d-%d-%d",month,day,year);
    }
}
