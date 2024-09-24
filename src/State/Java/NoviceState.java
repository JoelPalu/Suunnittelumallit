public class NoviceState implements State{
    @Override
    public void train(GameCharacter character) {
        character.setExperience(character.getExperience() + 10);
        System.out.println("Training... " + character.getName() + " gained 10 experience points.");
    }

    @Override
    public void meditate(GameCharacter character) {
        character.setHealth(character.getHealth() + 5);
        System.out.println(character.getName() + " meditated. Health recovered by 5.");

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
        if (character.getExperience() >= 20) {
            character.setState(new IntermediateState());
            System.out.println(character.getName() + " is now an Intermediate.");
        }

    }
}
