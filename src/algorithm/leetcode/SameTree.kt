package algorithm.leetcode


import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by yonghoon on 2019-01-15
 * Blog       : http://blog.pickth.com
 * Site       : https://leetcode.com/problems/same-tree
 * Difficulty : Easy
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val problem = SameTree()

    print(problem.isSameTree(SameTree.TreeNode(2), SameTree.TreeNode(2)))
}


class SameTree {
    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p?.`val`!= q?.`val`)
            return false

        if(p?.`val` == null) {
            return true
        }

        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}
