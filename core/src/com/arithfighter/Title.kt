package com.arithfighter

import com.arithfighter.entity.font.Font
import com.arithfighter.entity.font.FontGenerator
import com.arithfighter.entity.sprite.SpriteEntity
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Title {
    var obj: SpriteEntity
    var font: Font

    init {
        obj = SpriteEntity(Texture("badlogic.jpg"), 0.8f)
        obj.updatePosition(150f,180f)

        val fontGenerator = FontGenerator("pcsenior.ttf")
        fontGenerator.fontParameter.size = 16
        font = Font(fontGenerator)

        font.rectangle.x = 80f
        font.rectangle.y = 120f
    }

    fun render(batch:SpriteBatch){
        font.draw(batch, "Hello World");
		obj.draw(batch);
    }

    fun dispose(){
        obj.dispose();
		font.dispose();
    }
}