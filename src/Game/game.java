package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Chit Game!");
        System.out.println("Enter the number of players (4 players are required): ");
        int numPlayers = scanner.nextInt();

        if (numPlayers != 4) {
            System.out.println("The Game.game requires exactly 4 players. Exiting...");
            return;
        }

        List<Player> players = new ArrayList<>();
        players.add(new Player("Raja"));
        players.add(new Player("Police"));
        players.add(new Player("Chor"));
        players.add(new Player("Sipahi"));

        System.out.println("Let's begin the Game.game!");

        for (Player player : players) {
            int randomIndex = random.nextInt(players.size());
            Player pickedPlayer = players.get(randomIndex);
            System.out.println(player.getName() + " picked " + pickedPlayer.getName());

            if (player.getName().equals("Police")) {
                Player chor = null;
                for (Player p : players) {
                    if (!p.getName().equals("Police") && !p.getName().equals(pickedPlayer.getName())) {
                        chor = p;
                        break;
                    }
                }
                System.out.println("Police, guess who is the Chor (Enter the player's name): ");
                String guess = scanner.next();
                if (guess.equals(chor.getName())) {
                    System.out.println("Police guessed correctly! Points retained.");
                } else {
                    System.out.println("Police guessed wrong! Points surrendered to Chor.");
                    player.addPoints(-500); // Points surrendered to Chor
                    chor.addPoints(500); // Points gained by Chor
                }
            }

            players.remove(pickedPlayer);
        }

        // Calculate and display points
        for (Player player : players) {
            System.out.println(player.getName() + " scored " + player.getPoints() + " points.");
        }

        // Determine the winner
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getPoints() > winner.getPoints()) {
                winner = player;
            }
        }

        System.out.println("The winner is " + winner.getName() + " with " + winner.getPoints() + " points!");
    }
}
