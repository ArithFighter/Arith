package com.arithfighter.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Map;

public class SceneRenderer {
    String sceneCursor;
    SpriteBatch batch;
    Map<String, SceneEvent> map;

    public SceneRenderer(SpriteBatch batch, Map<String, SceneEvent> map){
        this.batch = batch;
        this.map = map;
    }

    public void render(){
        sceneCursor = "Title";

        try{
            SceneEvent s = map.get(sceneCursor);
            batch.begin();
            s.render();
            batch.end();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
