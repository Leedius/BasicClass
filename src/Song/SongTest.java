package Song;

import Member.Member;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SongTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song s1=new Song();

        String[] composer = {"김윤아", "이선규", "김진만"};

        s1.initSong("스물다섯, 스물하나",
                "자우림",
                "Goodbye, grief",
                "2013", composer);

        System.out.println("==============================");

        s1.printSongInfo();


        }
}
