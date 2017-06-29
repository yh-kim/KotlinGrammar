package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * Time complexity - O(n^2)
 */
class BubbleSort: Sort() {
    override val complexity = "n^2"

    override fun <T> sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        var value: T

        for(i in 0..arr.size - 2) {
            for( j in 0..arr.size - 2 - i) {
                if(compare(arr[j], arr[j+1])) {
                    value = arr[j]
                    arr[j] = arr[j+1]
                    arr[j+1] = value
                }
            }
        }

        show(arr)
        return arr
    }
}