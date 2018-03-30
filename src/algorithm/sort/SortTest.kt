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

    val compare: (Int, Int) -> Boolean = {
        a, b -> a>b
    }

    print("Initial array \t\t-  [" )
    for(i in arr) {
        print("$i, ")
    }
    print("]\n\n")

    BubbleSort<Int>().sort(arr.clone(), compare)
    SelectionSort<Int>().sort(arr.clone(), compare)
    InsertionSort<Int>().sort(arr.clone(), compare)
    MergeSort<Int>().sort(arr.clone(), compare)
    HeapSort<Int>().sort(arr.clone(), compare)
    QuickSort<Int>().sort(arr.clone(), compare)
}