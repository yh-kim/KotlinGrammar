package grammar.day0522

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val itemList = Array<Int?>(8, {null})

    itemList[0] = 100
    itemList[1] = 200
    itemList[2] = 300
    itemList[3] = 400

    println(itemList.size)

    println(itemList.lastIndex)

}