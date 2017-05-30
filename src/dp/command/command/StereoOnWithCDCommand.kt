package dp.command.command

import dp.command.receiver.Stereo

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class StereoOnWithCDCommand(val stereo: Stereo): Command {
    override fun undo() {
        stereo.off()
    }

    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }
}