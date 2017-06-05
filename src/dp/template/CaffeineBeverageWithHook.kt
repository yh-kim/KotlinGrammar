package dp.template

/**
 * Created by yonghoon on 2017-06-05
 * Blog   : http://blog.pickth.com
 * Github : https://github.com/yh-kim
 * Mail   : yonghoon.kim@pickth.com
 */
abstract class CaffeineBeverageWithHook {

    /**
     * 템플릿 메소드 패턴
     *
     * 알고리즘의 골격을 정의한다.
     * 알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있음.
     */
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        if(customerWantsCondiments()) {
            addCondiments()
        }
    }

    fun boilWater() {
        println("물 끓이는 중")
    }

    abstract fun brew()

    fun pourInCup() {
        println("컵에 따르는 중")
    }

    abstract fun addCondiments()

    /**
     * Hook
     *
     * 서브클래스에서 필요에 따라 오버라이드할 수 있는 메소드
     */
    open fun customerWantsCondiments(): Boolean {
        return true
    }
}