package Song;

import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class Song {
    String title;
    String artist;
    String album;
    String year;
    String[] composer = new String[3];      //String배열 선언만 했기때문에 배열 공간 생성도 안되어있다.


    //초기화 메소드
    public void initSong(String title1,
                         String artist1,
                         String album1,
                         String year1,
                         String[] composer1) {
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
        //작곡가 : 김자바 이자바 박자바
        System.out.print("작곡가는 : ");
        for(int i = 0; i<composer.length; i++){
            System.out.print(composer[i]+" ");
        }

    }
}
