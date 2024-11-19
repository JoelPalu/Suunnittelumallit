import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class FlyGameMap {
    FlyTile[][] tiles;
    int rows = 10;
    int columns = 10;

    public FlyGameMap(Canvas canvas) {
        int tileSize = 80;
        GraphicsContext gc = canvas.getGraphicsContext2D();

        tiles = new FlyTile[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                FlyTile tile = createTile();
                Image img = TileGraphicFactory.getTileImage(tile.getType());
                gc.drawImage(img, j * tileSize, i * tileSize, tileSize, tileSize);
                tiles[i][j] = tile;
            }
        }
    }

    abstract FlyTile createTile();

    void display() {
        for (FlyTile[] tile : tiles) {
            for (FlyTile value : tile) {
                System.out.print(value.getCharacter() + " ");
            }
            System.out.println();
        }
    }

}
