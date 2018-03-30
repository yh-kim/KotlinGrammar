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
class MergeSort<T> : Sort<T>() {
    override val complexity: String = "nlogn"

    private lateinit var mCompare: (T, T) -> Boolean
    private lateinit var mTemps :Array<Any?>

    override fun sort(arr: Array<T>, compare: (T, T) -> Boolean): Array<T> {
        mCompare = compare
        mTemps = Array(arr.size, { null })

        mergeSort(arr, 0, arr.size - 1)
        show(arr)
        return arr
    }

    private fun mergeSort(arr: Array<T>, l: Int, r: Int) {
        val m = (l + r) / 2
        if (l < r) {
            mergeSort(arr, l, m)
            mergeSort(arr, m + 1, r)
            merge(arr, l, r, m)
        }
    }

    private fun merge(arr: Array<T>, l: Int, r: Int, m: Int) {
        var i = l
        var j = m + 1
        var k = l

        while(i <= m && j <= r) {
            if(mCompare(arr[i], arr[j])) {
                mTemps[k] = arr[j++]
            } else {
                mTemps[k] = arr[i++]
            }
            k++
        }

        if(i > m) {
            for(p in j..r) {
                mTemps[k++] = arr[p]
            }
        } else {
            for(p in i..m) {
                mTemps[k++] = arr[p]
            }
        }

        for(p in l..r) arr[p] = mTemps[p] as T

//        show(arr)
    }
}