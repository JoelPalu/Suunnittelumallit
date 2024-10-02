public class GameCharacter {
    private State state;
    private String name;
    private int experience;
    private int health;
    private boolean alive;

    public GameCharacter(String name) {
        this.name = name;
        this.state = new NoviceState();
        this.experience = 0;
        this.health = 100;
        this.alive = true;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void train() {
        state.train(this);
        levelUp();
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
        levelUp();
    }

    public void displayActions() {
        state.displayActions();
    }

    public void levelUp() {
        state.levelUp(this);
    }

    public String displayState() {
        return state.displayState();
    }

    public String displayStats() {
        return "Name: " + name + "\nState: " + displayState() + "\nExperience: " + experience + "\nHealth: " + health;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }


}
