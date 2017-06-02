package dp.facade

import dp.facade.sub.*

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val homeTheater = HomeTheaterFacade(Amplifier(), Tuner(), DvdPlayer(), Projector(), Screen(), TheaterLights(), PopcornPopper())

    homeTheater.watchMovie("Raiders of the Lost Ark")
    homeTheater.endMovie()
}