public class MasterState implements State{
    @Override
    public void train(GameCharacter character) {
        System.out.println(character.getName() + " is already a Master. Training is not necessary.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println(character.getName() + " is already a Master. Meditating is not necessary.");

    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println(character.getName() + " is already a Master. Fighting is not necessary.");

    }

    @Override
    public void displayActions() {
        System.out.println("As a Master, you watch over your students.");
    }

    @Override
    public String displayState() {
        return "Master";
    }

    @Override
    public void levelUp(GameCharacter character) {
        System.out.println(character.getName() + " is already a Master.");
    }
}
