package dp.template

/**
 * Created by yonghoon on 2017-06-05
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class Tea: CaffeineBeverageWithHook() {
    override fun brew() {
        println("차를 우려내는 중")
    }

    override fun addCondiments() {
        println("레몬을 추가하는 중")
    }
}