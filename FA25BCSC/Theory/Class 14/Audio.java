public class Audio extends Media {

    //Media media;
    int bitrate;
    String artist;
    public int x=20;  // shadow parent attribute

    public static int y=6;


//    public void finalTest(){
//
//    }
    public static void staticTest(){

    }

    Audio(String title, double duration, double filesize, int bitrate, String artist){
        super(title,duration,filesize);
        this.bitrate=bitrate;
        this.artist=artist;
    }

    @Override
    public void test(){
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

    public void displayTest(){
        System.out.println(getTestAttribute());
    }
    @Override
    public int getTestAttribute() {
        return super.getTestAttribute();
    }
}
