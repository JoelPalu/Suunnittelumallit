import java.util.Random;

public class IntermediateState implements State{

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
            System.out.println(character.getName() + " can't even hold a weapon.");
        }

        @Override
        public void displayActions() {
            System.out.println("Actions: train, meditate");
        }

        @Override
        public String displayState() {
            return "Intermediate";
        }

        @Override
        public void levelUp(GameCharacter character) {
            if (character.getExperience() >= 100) {
                character.setState(new ExpertState());
                System.out.println(character.getName() + " is now an Expert.");
            }

        }
    }


