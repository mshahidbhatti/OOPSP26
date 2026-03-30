public class LiveStream extends Video{
    String streamerName;
    boolean isLive;

    LiveStream(String title, double duration, double fileSize, int frameRate, int resolution) {
        super(title, duration, fileSize, frameRate, resolution);
    }


    public void display(){
        super.display();
        System.out.println(streamerName);
        System.out.println(isLive);

    }
}
