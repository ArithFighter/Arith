package com.arithfighter.entity.font

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.Gdx

class FontGenerator(path: String?) {
    val fontGenerator: FreeTypeFontGenerator
    val fontParameter: FreeTypeFontParameter

    init {
        fontGenerator = FreeTypeFontGenerator(Gdx.files.internal(path))
        fontParameter = FreeTypeFontParameter()
    }

    fun getNewFont(): BitmapFont? {
        return fontGenerator.generateFont(fontParameter)
    }

    fun dispose() {
        fontGenerator.dispose()
    }
}