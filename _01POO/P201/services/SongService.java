package _01POO.P201.services;

import _01POO.P201.entities.Song;

import java.util.Scanner;

public class SongService {
    Scanner scanner = new Scanner(System.in);

    public Song createSong() {
        Song song = new Song();

        System.out.print("Ingrese el título: ");
        song.setTitle(scanner.nextLine());
        System.out.print("Ingrese el autor: ");
        song.setAuthor(scanner.nextLine());

        return song;
    }
}
