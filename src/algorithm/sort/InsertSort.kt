package algorithm.sort

/**
 * Created by yonghoon on 2017-06-29
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 *
 * Time complexity - O(n^2)
 */
class InsertSort: Sort() {
    override var complexity: String
        get() = "n^2"
        set(value) {}

    override fun <T> sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        for(i in 1..arr.size - 2) {
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