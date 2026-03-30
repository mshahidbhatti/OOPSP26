public class Media {
    String title;
    double duration;
    double fileSize;
    private int testAttribute;
    public int x=10;

    public static int y=5;

    public static void staticTest(){

    }
    public final void finalTest(){

    }


    Media(String title, double duration, double fileSize){
        this.title=title;
        this.duration =duration;
        this.fileSize=fileSize;
    }

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

    public int getTestAttribute() {
        return testAttribute;
    }

    public void setTestAttribute(int testAttribute) {
        this.testAttribute = testAttribute;
    }

    public   void test(){

    }

    @Override
    public String toString() {
        return String.format("%s %f %f", title , fileSize, duration);
    }
}
