package tiles;

import java.awt.*;
import java.awt.image.BufferedImage;
//TILE CLASS ALL TILES WILL EXTEND THIS CLASS
public class Tile {
    //SO WE DONT HAVE MAGIC NUMBERS DIFFERENT TILES IDS
    private static final int GRASS_ID = 0;


    //END TILES IDS

    //ARRAY WITH THE UNIQUE IDS OF ALL TYPE OF TILES WE WILL HAVE , 256 SHOULD BE MORE THAN ENOUGH
    public static Tile[] tiles = new Tile[256];
    //INITIALIZE ALL TYPES OF TILES HERE
    public static Tile grassTile = new GrassTile(GRASS_ID);



    //END INITIALIZE TILES

    public static final int TILE_WIDTH = 32, TILE_HEIGHT = 32;
    protected BufferedImage texture;
    protected final int id;
    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        //ADDING THE TILE ID TO THE TILES ARRAY, SO WE CAN ACCESS IT FOR RENDERING
        tiles[id] = this;
    }


    public void update() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
    }

    boolean isWalkable() {
        return true;
    }

    boolean isBreakable() {
        return false;
    }

    public int getId() {
        return this.id;
    }

}