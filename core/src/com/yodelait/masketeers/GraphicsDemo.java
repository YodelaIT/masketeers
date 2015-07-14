package com.yodelait.masketeers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Thomas Dhondt
 */
public class GraphicsDemo extends ApplicationAdapter {
    private SpriteBatch batch;
    private Pixmap pixmap;
    private Texture texture;
    private Sprite sprite;

    @Override
    public void create(){
        batch = new SpriteBatch();
        // A Pixmap is basically a raw image in memory as repesented by pixels
        // We create one 256 wide, 128 height using 8 bytes for Red, Green, Blue and Alpha channels
        pixmap = new Pixmap(256,128, Pixmap.Format.RGBA8888);
        
        // fill it red
        pixmap.setColor(Color.RED);
        pixmap.fill();
        
        // Draw two lines forming an X
        pixmap.setColor(Color.BLACK);
        pixmap.drawLine(0,0, pixmap.getWidth()-1,pixmap.getHeight()-1);
        pixmap.drawLine(0,pixmap.getHeight()-1,pixmap.getWidth()-1,0);
        
        // Draw a circle in the middle
        pixmap.setColor(Color.BLUE);
        // parameters for drawcircle: x,y from middle and radius
        pixmap.drawCircle(pixmap.getWidth()/2, pixmap.getHeight()/2, pixmap.getHeight()/2-1);
        // if you want a filled circle use this : 
        pixmap.fillCircle(pixmap.getWidth()/2, pixmap.getHeight()/2, pixmap.getHeight()/2-1);
        
        texture = new Texture(pixmap);
        
        // It's the textures responsibility now...
        pixmap.dispose();
        sprite = new Sprite(texture);
    }
    
    @Override
    public void dispose(){
        batch.dispose();
        texture.dispose();
    }
    
    @Override
    public void render(){
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        batch.begin();
        sprite.setPosition(0,0);
        sprite.draw(batch);
        sprite.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
        sprite.draw(batch);
        batch.end();
    }
    
    
}
