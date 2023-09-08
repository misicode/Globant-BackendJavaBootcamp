package POO.P201;

import POO.P201.entities.Song;
import POO.P201.services.SongService;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongService();
        Song song = songService.createSong();

        System.out.println(song);
    }
}
