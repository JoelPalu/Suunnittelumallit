public class ExpertState implements State{

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
        character.setHealth(character.getHealth() - 10);
        if (character.getHealth() <= 0) {
            System.out.println(character.getName() + " fought bravely, but died.");
            return;
        }

        character.setExperience(character.getExperience() + 20);

        System.out.println(character.getName() + " fought. Health lost by 10. Gained 20 experience points.");
    }

    @Override
    public void displayActions() {
        System.out.println("Actions: train, meditate, fight");
    }

    @Override
    public String displayState() {
        return "Expert";
    }

    @Override
    public void levelUp(GameCharacter character) {
        if (character.getExperience() >= 200) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " is now an Master.");
        }

    }
}


