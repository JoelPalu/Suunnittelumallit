import java.util.Random;

public class WildernessMap extends Map {
    @Override
    Tile createTile() {
        int random = new Random().nextInt(3);
        switch (random) {
            case 0:
                return new WaterTile();
            case 1:
                return new SwampTile();
            case 2:
                return new ForestTile();
            default:
                return null;
        }
    }
}
