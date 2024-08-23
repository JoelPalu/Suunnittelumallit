public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.createMap(new WildernessMap());

    }

    public void createMap(Map map) {
        map.display();
    }
}
