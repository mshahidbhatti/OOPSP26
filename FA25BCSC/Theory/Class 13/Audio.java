public class Audio extends Media {

    //Media media;
    int bitrate;
    String artist;

    Audio(String title, double duration, double filesize, int bitrate, String artist){
        super(title,duration,filesize);
        this.bitrate=bitrate;
        this.artist=artist;
    }

    public void play(){
        System.out.println(title+ " of "+ artist +" is playing");
    }

    public void display(){
        super.display();

        System.out.println(bitrate);
        System.out.println(artist);

    }
    public String toString(){
        return String.format("%s %d %s", super.toString(), bitrate, artist);
    }
}
