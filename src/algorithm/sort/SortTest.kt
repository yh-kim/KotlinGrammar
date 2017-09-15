package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
//    var arr = arrayOf(4, 2, 3, 1, 5)
    var arr = arrayOf(5,39,2,44,33)
//    var arr = arrayOf(30000,1,3,10,3,5)

    print("Initial array - [" )
    for(i in arr) {
        print("$i, ")
    }
    print("]\n\n")

    SelectionSort().sort(arr.clone(), { a, b -> a > b})
    BubbleSort().sort(arr.clone(), {a, b -> a > b})
    InsertionSort().sort(arr.clone(), { a, b -> a > b})
    QuickSort().sort(arr.clone(), { a, b -> a > b})
}