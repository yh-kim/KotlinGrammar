package dp.command.command

import dp.command.receiver.Light

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class LightOffCommand(var light: Light): Command {
    override fun undo() {
        light.on()
    }

    override fun execute() {
        light.off()
    }
}