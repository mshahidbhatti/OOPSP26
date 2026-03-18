public class Demo {
    public static void main(String[] args) {
        Media media1=new Media("Technical Talk",10, 200);
     //   media1.display();
        System.out.println(media1);

        Audio audio1=new Audio("Poltical Talk",10, 200,32,"Journalist");
     //   audio1.display();
        System.out.println(audio1);
        Podcast podcast=new Podcast("Poltical Talk",10, 200,32,"Journalist");
       // podcast.display();

        LiveStream liveStream1=new LiveStream("Poltical Talk",10, 200,32,120);
     //   liveStream1.display();
        System.out.println(liveStream1);





    }
}
