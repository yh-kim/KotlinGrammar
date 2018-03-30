package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var arr = arrayOf(4, 2, 3, 1, 5)
//    var arr = arrayOf(5,39,2,44,33)
//    var arr = arrayOf(30000,1,3,10,3,5)

    print("Initial array \t\t-  [" )
    for(i in arr) {
        print("$i, ")
    }
    print("]\n\n")

    BubbleSort<Int>().sort(arr.clone(), {a, b -> a > b})
    SelectionSort<Int>().sort(arr.clone(), { a, b -> a > b})
    InsertionSort<Int>().sort(arr.clone(), { a, b -> a > b})
    MergeSort<Int>().sort(arr.clone(), { a, b -> a > b})
    QuickSort<Int>().sort(arr.clone(), { a, b -> a > b})
}