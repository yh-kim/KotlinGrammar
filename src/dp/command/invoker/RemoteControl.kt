package dp.command.invoker

import dp.command.command.Command
import dp.command.command.NoCommand

/**
 * Created by yonghoon on 2017-05-30
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class RemoteControl {
    private var onCommands = arrayOfNulls<Command>(7)
    private var offCommands = arrayOfNulls<Command>(7)

    private var noCommand: Command = NoCommand()
    private var undoCommand: Command? = NoCommand()

    init {
        for(i in 0..6) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPressed(slot: Int) {
        onCommands[slot]?.execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPressed(slot: Int) {
        offCommands[slot]?.execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand?.undo()
    }

    override fun toString(): String {
        var stringBuff = StringBuffer()
        stringBuff.append("\n----- Remote Control -----\n")
        for(i in 0..onCommands.size - 1)
            stringBuff.append("[slot$i] ${onCommands[i]?.javaClass?.name} \t ${offCommands[i]?.javaClass?.name} \n")

        stringBuff.append("[undo] ${undoCommand?.javaClass?.name}\n")
        return stringBuff.toString()
    }
}