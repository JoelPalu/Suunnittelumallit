public class RoadTile implements Tile {
    @Override
    public void action() {
        System.out.print("You are on the road. ");
    }

    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDiscription() {
        return "Road";
    }
}
