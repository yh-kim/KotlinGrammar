package day0522

/**
 * Created by yonghoon on 2017-05-22
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var rectangle = Rectangle(10,3)

    rectangle.draw()

    rectangle.width = 30
    rectangle.height = 4
    rectangle.penPoint = '@'
    rectangle.draw()
}