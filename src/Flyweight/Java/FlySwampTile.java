import javafx.scene.image.Image;

public class FlySwampTile implements FlyTile {
    private TileImage image;

    public FlySwampTile() {
        this.image = new TileImage(TileType.SWAMP);
    }

    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public TileType getType() {
        return TileType.SWAMP;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
