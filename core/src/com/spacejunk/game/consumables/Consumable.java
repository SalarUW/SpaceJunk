package com.spacejunk.game.consumables;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.spacejunk.game.GameScreen;
import com.spacejunk.game.levels.Level;

/**
 * Created by vidxyz on 2/10/18.
 */

public abstract class Consumable {

    public enum CONSUMABLES {LIFE, INVISIBILITY, FIRESUIT, GAS_MASK, SPACE_HAMMER, UNEQUIPPED};


    // Initial dummy setting
    protected int x = -1;
    protected int y = -1;

    protected CONSUMABLES consumableType;

    protected Texture consumableTexture;

    protected Texture consumableTextureSmall;
    protected Level level;

    protected Sound sound;

    protected Rectangle consumableShape;

    public Consumable() {
        this.consumableShape = new Rectangle();
    }

    public Rectangle getConsumableShape() {
        return consumableShape;
    }


    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y - (GameScreen.getScaledTextureHeight(consumableTexture) / 2);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public CONSUMABLES getType() {
        return this.consumableType;
    }

    public void moveLeft() {
        this.x -= this.level.getVelocity();
    }

    public Texture getTexture() {
        return this.consumableTexture;
    }

    public Texture getConsumableTextureSmall() {
        return consumableTextureSmall;
    }

    public void playSound() {
        this.sound.play(1.0f);
    }

}
