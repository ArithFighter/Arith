package com.arithfighter.entity.font

class FontService(file:String) {
    private var fontMap: Map<Int, Font> = HashMap()

    init{
        val ary = arrayOf(12,16,18)
        val fontGenerator = FontGenerator(file)

        for(i in ary){
            fontGenerator.fontParameter.size = i
            val font = Font(fontGenerator)
            (fontMap as HashMap<Int, Font>)[i] = font
        }
    }

    fun getFont(size:Int): Font? {
        return fontMap[size]
    }
}