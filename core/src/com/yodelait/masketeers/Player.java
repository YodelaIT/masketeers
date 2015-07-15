package com.yodelait.masketeers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Thomas Dhondt
 */
public class Player {

    private Texture img;
    private float posX;
    private float posY;

    public Player() {
        img = new Texture("images/testpingu.png");
        posX = 100;
        posY = 0;
    }

    public void draw(SpriteBatch batch, boolean left) {
        batch.draw(img, posX, posY, 128, 128, 0, 0, 128, 128, left, false);
    }

    void moveRight() {
        posX += 1f;
    }

    void moveLeft() {
        posX -= 1f;
    }

}
