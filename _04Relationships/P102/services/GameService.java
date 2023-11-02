package org.amincia._04Relationships.P102.services;

import org.amincia._04Relationships.P102.entities.Game;
import org.amincia._04Relationships.P102.entities.Player;
import org.amincia._04Relationships.P102.entities.WaterRevolver;

import java.util.ArrayList;
import java.util.Scanner;

public class GameService {
    Scanner scanner = new Scanner(System.in);
    private static final PlayerService playerService = new PlayerService();
    private static final WaterRevolverService waterRevolverService = new WaterRevolverService();

    public Game startGame() {
        ArrayList<Player> players = new ArrayList<>();
        WaterRevolver waterRevolver = waterRevolverService.fillRevolver();
        Game game = new Game();

        System.out.println("JUEGO DE LA RULETA RUSA");
        System.out.print("Ingrese el número de jugadores (1-6): ");
        int numPlayers = scanner.nextInt();

        if(numPlayers < 1 || numPlayers > 6) numPlayers = 6;
        for(int i = 0; i < numPlayers; i++) players.add(new Player(i + 1));

        game.setPlayers(players);
        game.setNumPlayers(players.size());
        game.setWaterRevolver(waterRevolver);

        return game;
    }

    public void round(Game game) {
        Player player;
        int i = 0;

        do {
            player = game.getPlayers().get(i);
            i = (i >= game.getNumPlayers() - 1) ? 0 : i + 1;
        } while(!playerService.shot(player, game.getWaterRevolver()));
    }
}
