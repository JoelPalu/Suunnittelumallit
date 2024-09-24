import java.util.Objects;
import java.util.Scanner;

public class StateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character name: ");
        String name = scanner.nextLine();
        GameCharacter character = new GameCharacter(name);

        while (true) {
            System.out.println("=====================================");
            System.out.println(character.displayStats());
            System.out.println("-------------------------------------");
            character.displayActions();
            System.out.print("Choose action: ");
            String action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "train":
                    character.train();
                    break;
                case "meditate":
                    character.meditate();
                    break;
                case "fight":
                    character.fight();
                    break;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
            if (character.getHealth()<0){
                System.out.println("Game Over");
                break;
            }

            if (Objects.equals(character.displayState(), "Master")) {
                System.out.println("Congratulations! " + character.getName() + " has reached the Master level!");
                break;
            }
        }

        scanner.close();
    }
}

