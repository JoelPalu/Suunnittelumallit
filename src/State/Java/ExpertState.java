import java.util.Random;

public class ExpertState implements State{

    Random rand = new Random();

    @Override
    public void train(GameCharacter character) {
        int random = rand.nextInt(5, 20);
        character.setExperience(character.getExperience() + random);
        System.out.println("Training... " + character.getName() + " gained " + random + " experience points.");
    }

    @Override
    public void meditate(GameCharacter character) {
        int random = rand.nextInt(0,15);
        character.setHealth(character.getHealth() + random);
        System.out.println(character.getName() + " meditated. Health recovered by " + random + " points." );

    }

    @Override
    public void fight(GameCharacter character) {
        int randomHp = rand.nextInt(0,20);
        int randomXp = rand.nextInt(10,50);

        character.setHealth(character.getHealth() - randomHp);
        if (character.getHealth() <= 0) {
            System.out.println(character.getName() + " fought bravely, but died.");
            return;
        }

        character.setExperience(character.getExperience() + randomXp);

        System.out.println(character.getName() + " fought. Health lost by " + randomHp + ". Gained " + randomXp + " experience points.");
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


