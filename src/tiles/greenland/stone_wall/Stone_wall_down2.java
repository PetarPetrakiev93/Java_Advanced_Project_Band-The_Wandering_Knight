package tiles.greenland.stone_wall;

import gfx.Assets;
import tiles.Tile;

//GRASS TILE
public class Stone_wall_down2 extends Tile {

    public Stone_wall_down2(int id) {
        super(Assets.stone_wall_down2, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }

}
