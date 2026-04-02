public class Demo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer;//  = new MediaPlayer(); //'MediaPlayer' is abstract; cannot be instantiated
        AudioPlayer audioPlayer=new AudioPlayer("song.mp3", 4.5, 320, "Atif Aslam");
       // audioPlayer.displayInfo();
        VideoPlayer videoPlayer=new VideoPlayer("movie.mp4", 120, "1080p", 30);
        // audioPlayer.displayInfo();


//        AudioPlayer m1 = new AudioPlayer("song.mp3", 4.5, 320, "Atif Aslam");
//        VideoPlayer m2 = new VideoPlayer("movie.mp4", 120, "1080p", 30);
//        StreamingPlayer m3 = new StreamingPlayer("Live News", 60,"https://stream.example.com/news");


        MediaPlayer m1 = new AudioPlayer("song.mp3", 4.5, 320, "Atif Aslam");
        MediaPlayer m2 = new VideoPlayer("movie.mp4", 120, "1080p", 30);
        MediaPlayer m3 = new StreamingPlayer("Live News", 60,"https://stream.example.com/news");
        MediaPlayer m4 = new AudioPlayer("song.mp3", 4.5, 320, "Atif ");
        MediaPlayer m5 = new VideoPlayer("movie.mp4", 120, "480p", 30);

        MediaPlayer [] mediaList={m1,m2,m3,m4,m5};

//        for(MediaPlayer temp: mediaList) {
//            System.out.println();
//            temp.displayInfo();
//        }

//        for(MediaPlayer temp: mediaList) {
//            System.out.println();
//            if(temp instanceof  AudioPlayer)
//            System.out.println(((AudioPlayer)temp).getArtist());
//        }

//        for(MediaPlayer temp: mediaList) {
//            System.out.println();
//            if(temp instanceof VideoPlayer)
//                ((VideoPlayer)temp).setResolution("2K");
//        }

        for(MediaPlayer temp: mediaList) {
            System.out.println();
            if(temp instanceof VideoPlayer)
                if(((VideoPlayer)temp).getResolution().equals("480p"))
                    ((VideoPlayer)temp).setResolution("2K");
        }



        for(MediaPlayer temp: mediaList)
            temp.displayInfo();

    }
}
