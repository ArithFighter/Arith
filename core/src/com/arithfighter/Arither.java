package com.arithfighter;

import com.arithfighter.entity.asset.ArithAsset;
import com.arithfighter.entity.font.FontService;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Arither extends ApplicationAdapter {
    SpriteBatch batch;
    Title title;
    ArithAsset arithAsset;

    @Override
    public void create() {
        batch = new SpriteBatch();

        arithAsset = new ArithAsset();
        arithAsset.load();

        title = new Title(new FontService("pcsenior.ttf"), (Texture) arithAsset.getAssetManager().get("badlogic.jpg"));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        AssetManager assetManager = arithAsset.getAssetManager();

        assetManager.update(17);

        if (assetManager.update()){
            batch.begin();
            title.render(batch);
            batch.end();
        }

    }

    @Override
    public void dispose() {
        batch.dispose();
        title.dispose();
        arithAsset.dispose();
    }
}
