public class SwampTile implements Tile {
    @Override
    public void action() {
        System.out.print("You are in the swamp. ");
    }

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDiscription() {
        return "Swamp";
    }
}
