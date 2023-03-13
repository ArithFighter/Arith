package com.arithfighter.scene.scenes

import com.arithfighter.entity.font.Font
import com.arithfighter.entity.font.FontService
import com.arithfighter.entity.sprite.SpriteEntity
import com.arithfighter.scene.SceneEvent
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Title (fontService:FontService, texture:Texture):SceneEvent{
    var obj: SpriteEntity
    var font: Font
    private lateinit var batch:SpriteBatch

    override fun setBatch(batch: SpriteBatch) {
        this.batch = batch
    }

    init {
        obj = SpriteEntity(texture, 0.8f)
        obj.updatePosition(150f,180f)

        font = fontService.getFont(16)!!
        font.rectangle.x = 80f
        font.rectangle.y = 120f
    }

    override fun render(){
        font.draw(batch, "Hello World")
		obj.draw(batch)
    }

    override fun dispose(){
        obj.dispose()
		font.dispose()
    }
}