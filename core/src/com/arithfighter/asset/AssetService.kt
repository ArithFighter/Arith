package com.arithfighter.asset

import com.badlogic.gdx.graphics.Texture
import java.util.HashMap

class AssetService (arithAsset: ArithAsset) {
    var textureMap: MutableMap<String, Texture> = HashMap()

    init {
        for (s in arithAsset.assetLibrary.imgList) {
            textureMap[s] = arithAsset.assetManager.get(s)
        }
    }
}