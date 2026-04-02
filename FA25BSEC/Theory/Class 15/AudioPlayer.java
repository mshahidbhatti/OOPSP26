public class AudioPlayer extends MediaPlayer {
    private int bitrate;
    private String artist;

    public AudioPlayer(String fileName, double duration, int bitrate, String artist) {
        super(fileName, duration);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio file: " + fileName + " by " + artist);
    }

    @Override
    public double calculateSize() {
        return (bitrate * duration * 60) / 8.0 / 1024; // size in MB (approx)
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bitrate: " + bitrate + " kbps");
        System.out.println("Artist: " + artist);
    }


}
