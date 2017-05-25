package dp.strategy.fly

/**
 * Created by yonghoon on 2017-05-23
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("저는 못 날아요")
    }
}