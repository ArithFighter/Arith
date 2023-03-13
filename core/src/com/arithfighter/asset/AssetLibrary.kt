package com.arithfighter.asset

import java.util.ArrayList

class AssetLibrary internal constructor() {
    var names = arrayOf(
        "badlogic.jpg",
        "pcsenior.ttf"
    )
    var imgList: List<String> = ArrayList()
    var fontList: List<String> = ArrayList()

    init {
        for (s in names) {
            if (s.endsWith(".jpg"))
                    (imgList as ArrayList<String>).add(s)
            else if (s.endsWith(".ttf"))
                    (fontList as ArrayList<String>).add(s)
        }
    }
}