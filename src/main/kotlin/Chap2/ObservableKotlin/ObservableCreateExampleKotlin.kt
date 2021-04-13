package Chap2.ObservableKotlin

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableEmitter

class ObservableCreateExampleKotlin {

    fun emit() {
        val source = Observable.create { emitter: ObservableEmitter<Int> ->
            emitter.onNext(100)
            emitter.onNext(200)
            emitter.onNext(300)

        }
        source.subscribe { data -> println("Result : $data") }
    }
}

fun main() {
    val demo=ObservableCreateExampleKotlin()
    demo.emit()
}