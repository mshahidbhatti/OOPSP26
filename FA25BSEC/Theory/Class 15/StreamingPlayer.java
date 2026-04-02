class StreamingPlayer extends MediaPlayer {
    private String streamURL;

    public StreamingPlayer(String fileName, double duration, String streamURL) {
        super(fileName, duration);
        this.streamURL = streamURL;
    }

    @Override
    public void play() {
        System.out.println("Streaming media from: " + streamURL);
    }

    @Override
    public double calculateSize() {
        return 0; // file is streamed, no fixed local size
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Stream URL: " + streamURL);
    }
}
