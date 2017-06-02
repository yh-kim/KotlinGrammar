package dp.adaptor.duck

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class TurkeyAdapter(val turkey: Turkey): Duck {

    override fun fly() {
        for (i in 0..4) {
            turkey.fly()
        }
    }

    override fun quack() {
        turkey.gobble()
    }
}