public class CityCinema {
    String cinemaName;
    CinemaScreen []screens;
    String city;

    CityCinema(String cinemaName, int screenCount, String city){
        this.cinemaName=cinemaName;
        screens=new CinemaScreen[screenCount];
        for (int i=0;i<screens.length;i++)
            screens[i]=new CinemaScreen("Cinema Screen","Screen "+i+1,40);
        this.city=city;
    }



    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<screens.length;i++)
                stringBuilder.append(screens[0].toString());
        return stringBuilder.toString();
    }



}
