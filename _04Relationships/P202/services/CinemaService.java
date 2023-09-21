package _04Relationships.P202.services;

import _04Relationships.P202.entities.Cinema;
import _04Relationships.P202.entities.Movie;
import _04Relationships.P202.entities.Viewer;

public class CinemaService {
    private Viewer[] viewers;
    private int viewersEntry;

    public void createViewers() {
        int numViewers = (int) (Math.random() * 48);
        viewers = new Viewer[numViewers];

        for(int i = 0; i < numViewers; i++) {
            int age = (int) (Math.random() * 71) + 10;
            double money = Math.round(((Math.random() * 21) + 5) * 100D) / 100D;
            viewers[i] = new Viewer("John Doe " + i, age, money);
        }
    }

    public Cinema createCinema() {
        Cinema cinema = new Cinema();

        cinema.setMovie(new Movie("Los Miserables", 1.58F, 16, "Tom Hooper"));
        cinema.setPriceCine(12.5);
        cinema.setHall(fillHall(cinema));

        return cinema;
    }

    private Viewer[][] fillHall(Cinema cinema) {
        Viewer[][] hall = new Viewer[8][6];

        for(Viewer viewer: viewers) {
            if(validateEntry(cinema, viewer)) {
                int numRow = (int) (Math.random() * 8);
                int numColumn = (int) (Math.random() * 6);

                if(hall[numRow][numColumn] == null) {
                    hall[numRow][numColumn] = viewer;
                } else {
                    lookEmptySeat(hall, viewer);
                }

                viewer.setEntry(true);
                viewersEntry++;
            }
        }

        return hall;
    }

    private boolean validateEntry(Cinema cinema, Viewer viewer) {
        return viewer.getMoney() >= cinema.getPriceCine() && viewer.getAge() >= cinema.getMovie().getMinAge();
    }

    private void lookEmptySeat(Viewer[][] hall, Viewer viewer) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 6; j++) {
                if(hall[i][j] == null) {
                    hall[i][j] = viewer;
                    return;
                }
            }
        }
    }

    public void showHall(Cinema cinema) {
        final String[] LETTERS = {"F", "E", "D", "C", "B", "A"};

        System.out.println("\t\t\t\tCINEMA");
        for(int i = 7; i >= 0; i--) {
            for(int j = 5; j >= 0; j--) {
                System.out.print((i + 1) + LETTERS[j]);
                System.out.print((cinema.getHall()[i][j] != null) ? " X | " : "   | ");
            }
            System.out.println();
        }

        System.out.println("\nNúmero de espectadores que llegaron al cine: " + viewers.length);
        System.out.println("Número de espectadores que ingresaron: " + viewersEntry);
        System.out.println("\nDetalle de película:\n" + cinema.getMovie());
        System.out.println("Precio de película: S/" + cinema.getPriceCine());
        System.out.println("\nDetalle de espectadores:");
        for(Viewer viewer: viewers) System.out.println(viewer);
    }
}
