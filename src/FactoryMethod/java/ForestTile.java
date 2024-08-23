public class ForestTile implements Tile {
    @Override
    public void action() {
        System.out.print("You are in the forest. ");
    }

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDiscription() {
        return "Forest";
    }
}
