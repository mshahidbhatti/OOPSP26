public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Date(Date other){
        this.day=other.getDay();
        this.month=other.getMonth();
        this.year=other.getYear();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1&&day<=30)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1&&month<=12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1)
            this.year = year;
    }
    public String toString(){
        return String.format("%02d-%02d-%d",month, day,year);
    }

}
