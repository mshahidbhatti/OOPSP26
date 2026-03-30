public class Podcast extends Audio{
    String hostname;
    int episodeNumber;
     public String x;

    Podcast(String title, double duration, double filesize, int bitrate, String artist) {
        super(title, duration, filesize, bitrate, artist);
    }


    public void display(){
        super.display();
        System.out.println(hostname);
        System.out.println(episodeNumber);
    }

    public String toString(){
        return String.format("%s %s %d", super.toString(), hostname, episodeNumber);
    }
}
