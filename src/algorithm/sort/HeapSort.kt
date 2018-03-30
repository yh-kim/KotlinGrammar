/*
 * Copyright 2017 Yonghoon Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package algorithm.sort

/**
 * Created by yonghoon on 2018-03-30
 * Blog   : http://blog.pickth.com
 *
 * Time complexity - O(nlogn)
 */
class HeapSort<T>: Sort<T>() {
    override val complexity: String = "nlogn"

    override fun sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        val heap = Heap(compare)

        for(item in arr) heap.insert(item)
        for(i in arr.size-1 downTo 0) arr[i] = heap.delete()

        show(arr)
        return arr
    }

    /**
     * 최대 힙
     */
    inner class Heap(private val compare: (T, T) -> Boolean) {
        var size = 0
        private val mItems = Array<Any?>(30, {null})

        fun insert(item: T) {
            var position = ++size

            while(position != 1 && compare(item, mItems[position/2] as T)) {
                mItems[position] = mItems[position/2]
                position /= 2
            }

            mItems[position] = item
        }

        fun delete(): T {
            var parent = 1
            var child = 2
            var item: T = mItems[1] as T
            var tmp = mItems[size--] as T

            while(child <= size) {
                if(child < size && compare(mItems[child+1] as T, mItems[child] as T)) {
                    child++
                }

                if(compare(tmp, mItems[child] as T)) break

                mItems[parent] = mItems[child]
                parent = child
                child *= 2
            }

            mItems[parent] = tmp

            return item
        }
    }
}