package dp.decorator

import java.io.BufferedInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

/**
 * Created by yonghoon on 2017-05-25
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
fun main(args: Array<String>) {
    var c: Int = 0

    var inputStream: InputStream =
            LowerCaseInputStream(
                    BufferedInputStream(
                            FileInputStream("test.txt")))

    while(c >= 0){
        c = inputStream.read()
        print(c.toChar())
    }

    inputStream.close()
}
