package dp.facade

import dp.facade.sub.*

/**
 * Created by yonghoon on 2017-06-02
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class HomeTheaterFacade(val amp:Amplifier, val tuner: Tuner, val dvdPlayer: DvdPlayer, val projector: Projector, val screen: Screen, val lights: TheaterLights, val popcornPopper: PopcornPopper) {
    fun watchMovie(movie: String) {
        println("Get ready to watch a movie")

        popcornPopper.on()
        popcornPopper.pop()
        lights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amp.on()
        amp.setDvd(dvdPlayer)
        amp.setSurroundsSound()
        amp.setVolume(5)
        dvdPlayer.on()
        dvdPlayer.play(movie)
    }

    fun endMovie() {
        println("\nGet ready to watch a movie...")

        popcornPopper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvdPlayer.stop()
        dvdPlayer.eject()
        dvdPlayer.off()
    }
}