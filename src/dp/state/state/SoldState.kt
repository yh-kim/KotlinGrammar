package dp.state.state

import dp.state.GumballMachine

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class SoldState(val gumballMachine: GumballMachine): State {
    override fun insertQuarter() {
        println("잠시만 기다려 주세요. 알맹이가 나가고 있습니다")
    }

    override fun ejectQuarter() {
        println("이미 알갱이를 뽑으셨습니다")

    }

    override fun turnCrank() {
        println("손잡이를 한 번만 돌려주세요")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        if(gumballMachine.count > 0) {
            gumballMachine.state = gumballMachine.hasQuarterState
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }
}