import javafx.scene.image.Image;

public class FlyWaterTile implements FlyTile {
    private TileImage image;

    public FlyWaterTile() {
        this.image = new TileImage(TileType.WATER);
    }

    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public TileType getType() {
        return TileType.WATER;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
