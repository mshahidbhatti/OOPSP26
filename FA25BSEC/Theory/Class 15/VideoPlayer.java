class VideoPlayer extends MediaPlayer {
    private String resolution;
    private int frameRate;

    public VideoPlayer(String fileName, double duration, String resolution, int frameRate) {
        super(fileName, duration);
        this.resolution = resolution;
        this.frameRate = frameRate;
    }

    @Override
    public void play() {
        System.out.println("Playing video file: " + fileName + " in " + resolution + " resolution");
    }

    @Override
    public double calculateSize() {
        // simple approximate logic for demo purposes
        return duration * 50; // MB
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution);
        System.out.println("Frame Rate: " + frameRate + " fps");
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}

