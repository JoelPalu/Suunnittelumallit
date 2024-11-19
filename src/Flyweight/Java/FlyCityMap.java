import javafx.scene.canvas.Canvas;

import java.util.Random;

public class FlyCityMap extends FlyGameMap {

    static Random random = new Random();

    static TileType[] tileNames = {TileType.ROAD, TileType.BUILDING};

    public FlyCityMap(Canvas canvas) {
        super(canvas);
    }

    @Override
    public FlyTile createTile() {
        int cityNum = random.nextInt(tileNames.length);
        return switch (tileNames[cityNum]) {
            case ROAD -> new FlyRoadTile();
            case BUILDING -> new FlyBuildingTile();
            default -> throw new IllegalArgumentException("Unknown map type: ");
        };
    }
}
