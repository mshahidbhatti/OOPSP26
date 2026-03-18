public class Media {
    String title;
    double duration;
    double fileSize;

    Media(String title, double duration, double fileSize){
        this.title=title;
        this.duration =duration;
        this.fileSize=fileSize;

    }
//    Media(){
//
//    }

    public void play(){
        System.out.println(title +" is playing");
    }
    public void pause(){
        System.out.println(title +" is paused");
    }
    public void stop(){
        System.out.println(title + "is stopped");
    }

    public void display(){
        System.out.println("Title:"+title);
        System.out.println(duration);
        System.out.println(fileSize);

    }

    @Override
    public String toString() {
        return String.format("%s %f %f", title , fileSize, duration);
    }
}
