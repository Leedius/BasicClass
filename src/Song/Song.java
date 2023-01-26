package Song;

import java.io.ObjectOutputStream;

public class Song {
    String title;
    String artist;
    String album;
    String year;
    String composer;

    public void setSongInfo(String title1,
                       String artist1,
                       String album1,
                       String year1,
                       String composer1) {
        title = title1;
        artist = artist1;
        album = album1;
        year = year1;
        composer = composer1;
    }
    public void printSongInfo(){
        System.out.println("노래제목은 : "+title);
        System.out.println("가수는 : "+artist);
        System.out.println("앨범제목은 : "+album);
        System.out.println("출시연도는 : "+year);
        System.out.println("작곡가는 : "+composer);

    }
}
