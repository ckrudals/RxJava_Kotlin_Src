package Chap03

import io.reactivex.rxjava3.core.Observable

class MapExampleKotlin {
    fun emit(){
        val balls= arrayOf("1","2","3","4","5")
        val source = Observable.fromArray(*balls)
            .map { ball -> "$ball🤍" }
        source.subscribe{data -> println(data)}
    }
}

fun main() {

    val demo=MapExampleKotlin()
    demo.emit()

}