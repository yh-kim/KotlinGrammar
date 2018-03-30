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
 *
 * Time complexity - O(nlogn)
 */
class QuickSort<T> : Sort<T>() {
    override val complexity: String = "nlogn"
    private lateinit var mCompare: (T, T) -> Boolean

    override fun sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        mCompare = compare
        partition(arr, 0, arr.size - 1)
        show(arr)
        return arr
    }

    private fun partition(arr: Array<T>, left: Int, right: Int) {
        var leftIndex = left
        var rightIndex = right
        val pivot = arr[(left + right) shr 1]

        while(leftIndex < rightIndex) {
            while(mCompare(pivot, arr[leftIndex])) leftIndex++
            while(mCompare(arr[rightIndex], pivot)) rightIndex--

            if(leftIndex <= rightIndex) {
                var temp = arr[leftIndex]
                arr[leftIndex] = arr[rightIndex]
                arr[rightIndex] = temp
                leftIndex++
                rightIndex--
            }
        }

        if(left < rightIndex) partition(arr, left, rightIndex)
        if(leftIndex < right) partition(arr, leftIndex, right)
    }
}