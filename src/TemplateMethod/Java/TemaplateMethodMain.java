import java.util.Scanner;

public class TemaplateMethodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TemplateGame game = new HeroGame();
        System.out.println("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();

        game.play(numberOfPlayers);
    }
}
