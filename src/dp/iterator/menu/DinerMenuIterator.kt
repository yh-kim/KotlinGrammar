package dp.iterator.menu

import kotlin.collections.Iterator

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class DinerMenuIterator(var items: Array<MenuItem?>): Iterator<MenuItem?> {
    var position = 0

    override fun hasNext(): Boolean {
        if(items[position] == null) {
            return false
        }

        return position < items.lastIndex
    }

    override fun next(): MenuItem? = items[position++]

    fun remove() {
        if(position <= 0) {
            println("next()를 한 번도 호출하지 않은 상태에서는 삭제할 수 없습니다")
            return
        }

        if(items[position-1] != null) {
            for(i in position-1..items.lastIndex) {
                items[i] = items[i+1]
            }

            items[items.lastIndex] = null
        }
    }
}