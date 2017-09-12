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
 * Created by yonghoon on 2017-09-12
 * Blog   : http://blog.pickth.com
 */

class QuickSort : Sort() {
    override val complexity: String = "nlogn"

    override fun <T> sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        partition(arr, 0, arr.size-1, compare)
        show(arr)
        return arr
    }

    fun <T> partition(arr: Array<T>, left: Int, right: Int, compare: (T, T) -> Boolean) {
        var leftIndex = left
        var rightIndex = right
        val pivotIndex = (left + right) / 2
        val pivot = arr[pivotIndex]

        while(leftIndex < rightIndex) {
            while (compare(pivot, arr[leftIndex])) leftIndex++
            while(compare(arr[rightIndex], pivot)) rightIndex--

            if(leftIndex < rightIndex) {
                var temp = arr[leftIndex]
                arr[leftIndex] = arr[rightIndex]
                arr[rightIndex] = temp
            }

        }

        if(left < leftIndex) partition(arr, left, leftIndex - 1, compare)
        if(leftIndex < right) partition(arr, leftIndex + 1, right, compare)
    }
}