import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HeroGame extends TemplateGame{

    private List<GameCharacter> players;
    private final Scanner scanner = new Scanner(System.in);
    private boolean endOfGame = false;


    @Override
    public void initializeGame(int numberOfPlayers) {
        players = new ArrayList<>();
        for ( int i = 1; i <= numberOfPlayers; i++){
            System.out.println("Enter player " + i + " name: ");
            String username = scanner.nextLine();
            GameCharacter player = new GameCharacter(username);
            players.add(player);
        }
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("=====================================");
        System.out.println("Player " + players.get(player).getName() + " turn");
        System.out.println(players.get(player).displayStats());
        System.out.println("-------------------------------------");
        System.out.println("Choose an action: ");
        players.get(player).displayActions();
        String action = scanner.nextLine();
        switch (action){
            case "train":
                players.get(player).train();
                break;
            case "meditate":
                players.get(player).meditate();
                break;
            case "fight":
                players.get(player).fight();
                break;
            default:
                System.out.println("Invalid action");
        }

        if (Objects.equals(players.get(player).displayState(), "Master")){
            endOfGame = true;
        }

    }

    @Override
    public void displayWinner() {
        int alivePlayers = 0;
        for (GameCharacter player : players){
            if (player.getHealth() > 0){
                alivePlayers++;
            }
        }

        if (alivePlayers == 1){
            for (GameCharacter player : players){
                if (player.getHealth() > 0){
                    System.out.println(player.getName() + " is the winner!");
                    endOfGame = true;
                }
            }
        }

        for (GameCharacter player : players){
            if (player.getState().displayState().equals("Master")){
                System.out.println(player.getName() + " is the winner!");
                endOfGame = true;
            }
        }

    }
}
