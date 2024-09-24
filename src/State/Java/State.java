public interface State {
    void train(GameCharacter character);
    void meditate(GameCharacter character);
    void fight(GameCharacter character);
    void displayActions();
    String displayState();
    void levelUp(GameCharacter character);
}