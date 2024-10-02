import java.util.Random;

public class NoviceState implements State{
    Random rand = new Random();

    @Override
    public void train(GameCharacter character) {
        int random = rand.nextInt(3, 10);
        character.setExperience(character.getExperience() + random);
        System.out.println("Training... " + character.getName() + " gained " + random + " experience points.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " don't know how to relax...");

    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " can't even hold a weapon.");
    }

    @Override
    public void displayActions() {
        System.out.println("Actions: train");
    }

    @Override
    public String displayState() {
        return "Novice";

    }

    @Override
    public void levelUp(GameCharacter character) {
        if (character.getExperience() >= 50) {
            character.setState(new IntermediateState());
            System.out.println(character.getName() + " is now an Intermediate.");
        }

    }
}
