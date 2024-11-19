import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static Map<TileType, Image> tileImages = new HashMap<>();

    public static Image getTileImage(TileType type) {
        Image image = tileImages.get(type);

        if (image == null) {
            image = loadImage(type);
            tileImages.put(type, image);
        }
        return image;
    }

    private static Image loadImage(TileType type) {
        return switch (type) {
            case BUILDING -> new Image("building.png");
            case ROAD -> new Image("field.png");
            case SWAMP -> new Image("swamp.png");
            case FOREST -> new Image("foressst.png");
            case WATER -> new Image("water.png");
        };
    }
}
