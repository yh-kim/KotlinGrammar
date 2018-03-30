package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * Time complexity - O(n^2)
 */
class SelectionSort<T> : Sort<T>() {
    override val complexity = "n^2"

    override fun sort(arr:Array<T>,compare: (T,T) -> Boolean): Array<T> {
        for(i in 0..arr.size - 2) {
            var min = i
            for(j in i+1 until arr.size) {
                if(compare(arr[min], arr[j])) {
                    min = j
                }
            }

            if(i != min) {
                var temp = arr[i]
                arr[i] = arr[min]
                arr[min] = temp
            }

        }

        show(arr)
        return arr
    }
}