package dp.iterator.composite

/**
 * Created by yonghoon on 2017-06-06
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
class MenuItem(var name:String, var description:String, var vegetarian: Boolean, var price: Double): MenuComponent() {

    override fun print() {
        print(" $name")
        if(vegetarian) print("(v)")

        println(", $price \n    -- $description")
    }

    override fun createIterator(): Iterator<MenuComponent> {
        return NullIterator() as Iterator<MenuComponent>
    }

    override fun isVegetarian(): Boolean {
        return vegetarian
    }
}