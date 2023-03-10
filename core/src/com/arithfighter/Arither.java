package com.arithfighter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Arither extends ApplicationAdapter {
    SpriteBatch batch;
    Title title;

    @Override
    public void create() {
        batch = new SpriteBatch();
        title = new Title();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        title.render(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        title.dispose();
    }
}
