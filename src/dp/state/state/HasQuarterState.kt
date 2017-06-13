package dp.state.state

import dp.state.GumballMachine
import java.util.*

/**
 * Created by yonghoon on 2017-06-13
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class HasQuarterState(val gumballMachine: GumballMachine): State {
    var randomWinner = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("동전은 한 개만 넣어주세요")
    }

    override fun ejectQuarter() {
        println("동전이 반환됩니다")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("손잡이를 돌리셨습니다")
        val winner = randomWinner.nextInt(10)
        if((winner == 0) && (gumballMachine.count > 1)) {
            gumballMachine.state = gumballMachine.winnerState
        } else {
            gumballMachine.state = gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("알맹이가 나갈 수 없습니다")
    }
}