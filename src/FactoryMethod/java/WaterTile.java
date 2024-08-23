public class WaterTile implements Tile {
    @Override
    public void action() {
        System.out.print("You are in the water. ");
    }

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDiscription() {
        return "Water";
    }
}
