package com.arithfighter.entity.sprite

import com.arithfighter.entity.Rectangle
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class SpriteEntity(t: Texture, scale: Float) {
    var rectangle = Rectangle()
    var sprite = Sprite()

    init {
        sprite.set(Sprite(t))
        rectangle.width = sprite.width*scale
        rectangle.height = sprite.height*scale
    }

    fun updatePosition(x:Float, y:Float){
        rectangle.x = x
        rectangle.y = y
    }

    fun updateShape(width:Float, height:Float){
        rectangle.width = width
        rectangle.height = height
    }

    fun draw(batch:SpriteBatch){
        setSprite()
        sprite.draw(batch)
    }

    private fun setSprite(){
        sprite.setSize(rectangle.width, rectangle.height)
        sprite.setPosition(rectangle.x, rectangle.y)
    }

    fun dispose(){
        sprite.texture.dispose()
    }
}