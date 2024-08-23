import java.util.Random;

public class CityMap extends Map {
    @Override
    Tile createTile() {
        int random = new Random().nextInt(3);
        switch (random) {
            case 0:
                return new RoadTile();
            case 1:
                return new BuildingTile();
            case 2:
                return new ForestTile();
            default:
                return null;
        }
    }
}
