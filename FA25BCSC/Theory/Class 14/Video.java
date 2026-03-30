public class Video extends Media{

    int frameRate;
    int resolution;

    Video(String title, double duration, double fileSize, int frameRate, int resolution) {
        super(title, duration, fileSize);
        this.frameRate=frameRate;
        this.resolution=resolution;
    }
    // this();


    public void display(){
        super.display();
        System.out.println(frameRate);
        System.out.println(resolution);
    }



}
