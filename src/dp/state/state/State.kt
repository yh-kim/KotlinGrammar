package dp.state.state

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
interface State {
    fun insertQuarter()

    fun ejectQuarter()

    fun turnCrank()

    fun dispense()
}