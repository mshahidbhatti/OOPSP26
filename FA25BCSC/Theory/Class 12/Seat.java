public class Seat {
    String seatID;
    SeatType seatType;
    String row;
    boolean isAvailbe=true;
    static int counter=1;
    Seat(SeatType type, String row){
        seatID=row+String.format("%02d",counter++);
        this.seatType=type;
        this.row=row;
    }

    public String getSeatID() {
        return seatID;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public String getRow() {
        return row;
    }
    public boolean isAvailbe() {
        return isAvailbe;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %.2f %b", seatID,seatType,row,seatType.price,isAvailbe);
    }


}

enum SeatType{
    VIP(20),Premium(15),Regular(10);
    double price;
    SeatType(double price){
        this.price=price;
    }
}

