import javafx.scene.image.Image;

public class FlyRoadTile implements FlyTile {
    private TileImage image;

    public FlyRoadTile() {
        this.image = new TileImage(TileType.ROAD);
    }

    @Override
    public String getCharacter() {
        return "R";
    }

    public TileType getType() {
        return TileType.ROAD;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
