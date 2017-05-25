package dp.decorator

import java.io.FilterInputStream

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class LowerCaseInputStream(inputStream: FilterInputStream): FilterInputStream(inputStream) {
    override fun read(): Int {
        var c = super.read()
        return if(c == -1) c else Character.toLowerCase(c)
    }

    override fun read(b: ByteArray?, off: Int, len: Int): Int {
        var result: Int = super.read(b, off, len)

        for(i in off..off+result - 1) {
            b?.set(i, Character.toLowerCase(b?.get(i) as Char) as Byte)
        }

        return result
    }

}