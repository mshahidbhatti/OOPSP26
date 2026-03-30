public class Demo {
    public static void main(String[] args) {


        A obj1=A.createObject("11");
        A obj2=A.createObject("12");

        System.out.println();
        System.out.println(obj2.s);


        Media media1=new Media("Technical Talk",10, 200);
     //   media1.display();

      //  System.out.println(media1.x);


//        System.out.println(media1.getTestAttribute());
//
        Audio audio1=new Audio("Poltical Talk",10, 200,32,"Journalist");
     //   audio1.display();
        System.out.println(audio1.y);
        System.out.println(Audio.y);

//        Podcast podcast=new Podcast("Poltical Talk",10, 200,32,"Journalist");
//       // podcast.display();
//
//        LiveStream liveStream1=new LiveStream("Poltical Talk",10, 200,32,120);
//     //   liveStream1.display();
//        System.out.println(liveStream1);





    }
}
