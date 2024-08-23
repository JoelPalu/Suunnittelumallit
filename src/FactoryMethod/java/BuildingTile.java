public class BuildingTile implements Tile {
    @Override
    public void action() {
        System.out.print("You are in the building. ");
    }

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDiscription() {
        return "Building";
    }
}
