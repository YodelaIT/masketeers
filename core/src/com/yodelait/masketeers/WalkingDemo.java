package com.yodelait.masketeers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Thomas Dhondt
 */
public class WalkingDemo extends ApplicationAdapter {

    private SpriteBatch batch;
    private Player player;

    @Override
    public void create() {
        batch = new SpriteBatch();
        player = new Player();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        boolean left = false;
        // process inputs
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            player.moveLeft();
            left = true;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            player.moveRight();
            left = false;
        }

        // render
        batch.begin();
        player.draw(batch, left);
        batch.end();
    }

}
