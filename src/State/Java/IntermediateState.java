public class IntermediateState implements State{

        @Override
        public void train(GameCharacter character) {
            character.setExperience(character.getExperience() + 10);
            System.out.println("Training... " + character.getName() + " gained 10 experience points.");
        }

        @Override
        public void meditate(GameCharacter character) {
            System.out.println(character.getName() + " don't know how to meditate yet.");

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
            if (character.getExperience() >= 50) {
                character.setState(new ExpertState());
                System.out.println(character.getName() + " is now an Expert.");
            }

        }
    }


