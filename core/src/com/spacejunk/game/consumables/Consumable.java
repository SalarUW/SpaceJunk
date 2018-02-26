package com.spacejunk.game.consumables;

import com.badlogic.gdx.graphics.Texture;
import com.spacejunk.game.levels.Level;
import com.spacejunk.game.obstacles.AsteroidObstacle;
import com.spacejunk.game.obstacles.FireObstacle;
import com.spacejunk.game.obstacles.Obstacle;

/**
 * Created by vidxyz on 2/10/18.
 */

public abstract class Consumable {

    public enum CONSUMABLES {LIFE, INVISIBILITY, FIRESUIT, GAS_MASK, SPACE_HAMMER};


    // Initial dummy setting
    protected int x = -1;
    protected int y = -1;

    protected int consumableNumber;
    protected CONSUMABLES consumableType;

    protected Texture consumableTexture;
    protected Level level;


    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getType() {
        return String.valueOf(this.consumableType);
    }


    public void moveLeft() {
        this.x = this.x - this.level.getVelocity();
    }

    public Texture getTexture() {
        return this.consumableTexture;
    }

}
