package Chap2

import io.reactivex.rxjava3.core.Single

class SingleExampleJustKotlin {

    fun emit(){
        val source= Single.just("Hello Single")
        source.subscribe(System.out::println)
    }
}

fun main() {
    val demo=SingleExampleJustKotlin()
    demo.emit()
}