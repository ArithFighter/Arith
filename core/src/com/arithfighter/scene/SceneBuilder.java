package com.arithfighter.scene;

import com.arithfighter.entity.font.FontService;
import com.arithfighter.scene.scenes.Title;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;
import java.util.Map;

public class SceneBuilder {
    Map<String, SceneEvent> sceneMap;

    public SceneBuilder(FontService fontService, Texture texture, SpriteBatch batch){
        Title title = new Title(fontService, texture);

        sceneMap = new HashMap<>();
        sceneMap.put(title.getClass().getSimpleName(), title);

        for(SceneEvent s:sceneMap.values())
            s.setBatch(batch);
    }

    public Map<String, SceneEvent> getSceneMap() {
        return sceneMap;
    }

    public void dispose(){
        for(SceneEvent s: sceneMap.values())
            s.dispose();
    }
}
