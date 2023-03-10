package com.arithfighter.entity.font

import com.arithfighter.entity.Rectangle
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Font(generator: FontGenerator) {
    val font: BitmapFont? = generator.getNewFont()
    val rectangle: Rectangle = Rectangle()

    fun draw(batch: SpriteBatch?, content: String?) {
        font?.draw(batch, content, rectangle.x, rectangle.y)
    }

    fun dispose() {
        font?.dispose()
    }
}