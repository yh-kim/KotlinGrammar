package dp.state.state

import dp.state.GumballMachine

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class NoQuarterState(val gumballMachine: GumballMachine): State {
    override fun insertQuarter() {
        println("동전을 넣으셨습니다")
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        println("동전을 넣어주세요")

    }

    override fun turnCrank() {
        println("동전을 넣어주세요")
    }

    override fun dispense() {
        println("동전을 넣어주세요")
    }
}