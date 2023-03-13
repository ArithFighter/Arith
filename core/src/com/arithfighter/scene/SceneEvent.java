package com.arithfighter.scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface SceneEvent {
    void setBatch(SpriteBatch batch);
    void render();
    void dispose();
}
