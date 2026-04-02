public abstract class MediaPlayer {
    protected String fileName;
    protected double duration; // in minutes

    public MediaPlayer(){

    }
    public MediaPlayer(String fileName, double duration) {
        this.fileName = fileName;
        this.duration = duration;
    }

    public abstract void play();

    public abstract double calculateSize();

    public void stop() {
        System.out.println(fileName + " has been stopped.");
    }

    public void displayInfo() {
        System.out.println("File Name: " + fileName);
        System.out.println("Duration: " + duration + " minutes");
    }
}
