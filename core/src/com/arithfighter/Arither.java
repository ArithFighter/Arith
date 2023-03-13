package com.arithfighter;

import com.arithfighter.asset.ArithAsset;
import com.arithfighter.asset.AssetService;
import com.arithfighter.entity.font.FontService;
import com.arithfighter.scene.SceneBuilder;
import com.arithfighter.scene.SceneRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Arither extends ApplicationAdapter {
    SpriteBatch batch;
    SceneBuilder sceneBuilder;
    SceneRenderer sceneRenderer;
    ArithAsset arithAsset;

    @Override
    public void create() {
        batch = new SpriteBatch();

        arithAsset = new ArithAsset();
        arithAsset.load();

        AssetService assetService = new AssetService(arithAsset);
        FontService pixelFonts = new FontService(arithAsset.getAssetLibrary().getFontList().get(0));

        sceneBuilder = new SceneBuilder(pixelFonts, assetService.getTextureMap().get("badlogic.jpg"), batch);
        sceneRenderer = new SceneRenderer(batch, sceneBuilder.getSceneMap());
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        AssetManager assetManager = arithAsset.getAssetManager();

        assetManager.update(17);

        if (assetManager.update()) {
            sceneRenderer.render();
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        sceneBuilder.dispose();
        arithAsset.dispose();
    }
}
