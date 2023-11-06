package org.amincia._01POO.Exercises.P201;

import org.amincia._01POO.Exercises.P201.entities.Song;
import org.amincia._01POO.Exercises.P201.services.SongService;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongService();
        Song song = songService.createSong();

        System.out.println(song);
    }
}
