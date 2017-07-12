package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * Time complexity - O(n^2)
 */
class SelectionSort : Sort() {
    override val complexity = "n^2"

    override fun <T> sort(arr:Array<T>,compare: (T,T) -> Boolean): Array<T> {
        var value: T

        for(i in 0..arr.size - 2) {
            for(j in i+1..arr.size - 1) {
                if(compare(arr[i], arr[j])) {
                    value = arr[i]
                    arr[i] = arr[j]
                    arr[j] = value
                }
            }
        }

        show(arr)
        return arr
    }
}