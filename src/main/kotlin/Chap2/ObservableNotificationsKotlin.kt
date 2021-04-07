package Chap2

import io.reactivex.rxjava3.core.Observable

class ObservableNotificationsKotlin {

    fun emit() {
        val source = Observable.just("RED", "GREEN", "YELLOW")

        val d = source.subscribe(
            { v -> println("onNext() : value : $v") },
            { err -> println("onError() : err : ${err.message}") },
            { println("onComplete()") }

        )
        print("isDisposed() : "+d.isDisposed)
    }
}

fun main() {
    val demo = ObservableNotificationsKotlin()
    demo.emit()
}