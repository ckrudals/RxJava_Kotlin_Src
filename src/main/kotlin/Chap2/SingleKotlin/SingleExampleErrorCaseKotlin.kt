package Chap2.SingleKotlin

import io.reactivex.rxjava3.core.Observable

class SingleExampleErrorCaseKotlin {
    fun emit(){
        val source= Observable.just("Hello Single","Error").single("default item")
        source.subscribe{x->println(x)}
    }
}

fun main() {
    val demo=SingleExampleErrorCaseKotlin()
    demo.emit()

}