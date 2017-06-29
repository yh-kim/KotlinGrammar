package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var arr = arrayOf(4, 2, 3, 1, 5)

    print("Initial array - [" )
    for(i in arr) {
        print("$i, ")
    }
    print("]\n\n")

    SelectSort().sort(arr, {a, b -> a > b})
    BubbleSort().sort(arr, {a, b -> a > b})
}