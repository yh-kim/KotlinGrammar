package dp.adaptor.duck

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class WildTurkey: Turkey {
    override fun fly() {
        println("I'm flying a short distance")
    }

    override fun gobble() {
        println("Gobble gobble")
    }

}