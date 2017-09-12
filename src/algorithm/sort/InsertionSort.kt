package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * Time complexity - O(n^2)
 */
class InsertionSort : Sort() {
    override val complexity = "n^2"

    override fun <T> sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        for(i in 1 until arr.size) {
            var value = arr[i]
            var index = 0

            for(j in i-1 downTo 0) {
                index = j
                if(compare(arr[j], value)) {
                    arr[j+1] = arr[j]
                } else {
                    index++
                    break
                }
            }

            arr[index] = value
        }

        show(arr)
        return arr
    }
}