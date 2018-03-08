package com.spacejunk.game.consumables;

import com.badlogic.gdx.graphics.Texture;
import com.spacejunk.game.levels.Level;

/**
 * Created by vidxyz on 2/10/18.
 */

public class GasMaskConsumable extends Consumable {

    public GasMaskConsumable(Level level) {
        this.consumableTexture = new Texture("gas_mask.png");
        this.level = level;
        this.consumableType = CONSUMABLES.GAS_MASK;
    }
}
