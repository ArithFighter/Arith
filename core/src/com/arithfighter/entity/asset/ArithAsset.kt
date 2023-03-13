package com.arithfighter.entity.asset

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.Texture

class ArithAsset {
    var assetManager: AssetManager = AssetManager()
    var assetLibrary: AssetLibrary = AssetLibrary()

    fun load() {
        for (s in assetLibrary.imgList)
            assetManager.load(s, Texture::class.java)

        assetManager.finishLoading()
    }

    fun dispose() {
        assetManager.dispose()
    }

}