import javafx.scene.image.Image;

public class FlyForestTile implements FlyTile {
    private TileImage image;

    public FlyForestTile() {
        image = new TileImage(TileType.FOREST);
    }

    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public TileType getType() {
        return TileType.FOREST;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }

}
