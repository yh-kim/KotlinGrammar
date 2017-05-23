package day0522

/**
 * Created by yonghoon on 2017-05-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
// data class에서 var는 읽기, 쓰기가 가능하고(getter, setter) val은 읽기만 가능(getter)
data class Rectangle(var width: Int, var height: Int) {
    var penPoint: Char = '#'

    fun draw() {
        var rowCount = 0

        for(x in 1..height) {
            for(y in 1..width) {
                print(penPoint)
            }
            println()
        }
    }

}