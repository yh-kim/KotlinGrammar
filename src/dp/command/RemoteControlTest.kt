package dp.command

import dp.command.invoker.RemoteControl
import dp.command.receiver.Light
import dp.command.receiver.Stereo
import dp.command.command.LightOnCommand
import dp.command.command.StereoOffWithCDCommand
import dp.command.command.StereoOnWithCDCommand

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    val remoteControl = RemoteControl()
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val stereo = Stereo("Living Room")


    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOnCommand(livingRoomLight)

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOnCommand(kitchenLight)

    val stereoOn = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffWithCDCommand(stereo)

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
    remoteControl.setCommand(2, stereoOn, stereoOff)

    // 실행
    remoteControl.onButtonWasPressed(0)

    println(remoteControl)

    remoteControl.onButtonWasPressed(0)
    remoteControl.offButtonWasPressed(0)
    remoteControl.onButtonWasPressed(1)
    remoteControl.offButtonWasPressed(1)
    remoteControl.onButtonWasPressed(2)
    remoteControl.offButtonWasPressed(2)

    // undo
    remoteControl.undoButtonWasPushed()

    println(remoteControl)

}