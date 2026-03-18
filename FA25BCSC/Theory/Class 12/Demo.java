public class Demo {
    public static void main(String[] args) {
        //   Seat(SeatType type, String row)
//        Seat seat1=new Seat(SeatType.VIP,"A");
//        Seat seat2=new Seat(SeatType.VIP,"A");
//        System.out.println(seat1);
//        System.out.println(seat2);

        //    Screen(String name, String id, int rowCount){

//        Screen screen1=new Screen("IMax","Screen1",5);
//        System.out.println(screen1);

        CityCinema cityCinema=new CityCinema("CinePlex",4);


        cityCinema.screens[0].seats[1][5].isAvailbe=false;
        for(int i=0;i<cityCinema.screens[0].seats.length;i++)
            for(int j=0;j<cityCinema.screens[0].seats[i].length;j++)
                if(cityCinema.screens[0].seats[i][j].seatID.equals("B12"))
                    if(cityCinema.screens[0].seats[i][j].isAvailbe=true)
                        cityCinema.screens[0].seats[i][j].isAvailbe=false;



/// cityCinema.screens[0].seats[i][j].seatID.equals("B12")
        System.out.println(cityCinema);
    }
}
