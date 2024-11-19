import javafx.scene.image.Image;

public class FlyBuildingTile implements FlyTile {
    private TileImage image;

    public FlyBuildingTile() {
        this.image = new TileImage(TileType.BUILDING);
    }

    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public TileType getType() {
        return TileType.BUILDING;
    }

    @Override
    public Image getTileImage() {
        return image.getImage();
    }
}
