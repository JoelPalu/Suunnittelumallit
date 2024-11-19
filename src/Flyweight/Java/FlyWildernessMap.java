import javafx.scene.canvas.Canvas;

import java.util.Random;

public class FlyWildernessMap extends FlyGameMap {

    static Random random = new Random();
    static TileType[] wilderTileNames = {TileType.SWAMP, TileType.WATER, TileType.FOREST};

    public FlyWildernessMap(Canvas canvas) {
        super(canvas);
    }


    @Override
    public FlyTile createTile() {
        int num = random.nextInt(wilderTileNames.length);
        return switch (wilderTileNames[num]) {
            case SWAMP -> new FlySwampTile();
            case WATER -> new FlyWaterTile();
            case FOREST -> new FlyForestTile();
            default -> throw new IllegalArgumentException("Unknown map type");
        };
    }
}
